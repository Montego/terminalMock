package com.terminalmock.test.services.entityServices;

import com.terminalmock.test.dto.PersonTableDto;
import com.terminalmock.test.entities.entity.*;
import com.terminalmock.test.entities.entity.address.AddressCellBasedDto;
import com.terminalmock.test.entities.entity.address.PersonAddress;
import com.terminalmock.test.entities.entity.address.PersonParentAddress;
import com.terminalmock.test.repositories.entityrepo.PersonInfoRepo;
import com.terminalmock.test.repositories.entityrepo.PersonRepo;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.terminalmock.test.services.entityServices.AddressService.convertAdrDtoToAdr;

@Service
public class PersonService {
    private final PersonRepo person_Repo;
    private final PersonInfoRepo personInfoRepo;

    public PersonService(PersonRepo person_Repo, PersonInfoRepo personInfoRepo) {
        this.person_Repo = person_Repo;
        this.personInfoRepo = personInfoRepo;
    }

    public Person getOne(long id) {
        return person_Repo.findById(id).orElse(null);
    }

    public List<Person> getAll() {
        return person_Repo.findAll();
    }

    public List<PersonTableDto> getAllPersonTableDto(User user) {
        List<PersonInfo> persons;
        if (user.isAdmin()){
            persons = personInfoRepo.findAll();
        } else {
            persons = personInfoRepo.findAllByModifiedBy(user.getAlias());
        }

        List<PersonTableDto> personsDto = new ArrayList<>();

        for (PersonInfo person : persons){
            PersonTableDto dto = new PersonTableDto();
            dto.setId(person.getId());
            dto.setTab_personal_lastname(person.getTab_personal_lastname());
            dto.setTab_personal_firstname(person.getTab_personal_firstname());
            dto.setTab_personal_middlename(person.getTab_personal_middlename());
            dto.setTab_personal_birthDate(person.getTab_personal_birthDate());
            dto.setResultAcceptPerson(person.getPerson().getAcceptedPerson());
            dto.setSaved(person.getPerson().getSaved());
            personsDto.add(dto);
        }

        return personsDto;
    }


//    public List<ApplicationTableDto> getAllApplicationTableDto() {
//        List<PersonInfo> persons= personInfoRepo.findAll();
//        List<ApplicationTableDto> applicationsTableDto = new ArrayList<>();
//        for(int i =0; i<persons.size(); i++){
//            ApplicationTableDto applicationTableDto = new ApplicationTableDto(
//                    persons.get(i).getId(),
//                    persons.get(i).getTab_personal_name()
////                    persons.get(i).getApplication_number(),
////                    persons.get(i).getApplication_date(),
////                    persons.get(i).getApplication_selectedDeliveryType().getName(),
////                    persons.get(i).isBudget()
//            );
//            applicationsTableDto.add(applicationTableDto);
//        }
//        return applicationsTableDto;
//    }

//    public List<ApplicationDto> getAllApplicationDto() {
//        List<Person> persons= person_Repo.findAll();
//        List<ApplicationDto> applicationsDto = new ArrayList<>();
//        for(int i = 0; i<persons.size(); i++){
//            ApplicationDto applicationDto = new ApplicationDto(
//
//            );
//            applicationsDto.add(applicationDto);
//        }
//        return applicationsDto;
//    }

    public void save(Person person, User user){
//        person.getPerson_info();
        if (user == null){
            throw new UsernameNotFoundException("user not found exeption");
        }
        person.getPerson_info().setModifiedBy(user.getAlias());
        HandleAddresses(person);
        cleanFutureDocs(person);

        person_Repo.save(person);
    }

    public void delete(Long id) {
        person_Repo.deleteById(id);
    }



    private void HandleAddresses(Person person){
        createAddressesFromDto(person.getPerson_info());
        if (person.getParents_info() != null){
            for (PersonParent parent: person.getParents_info()){
                if (parent.getAddressDto() != null){
                    createAddressFromDto(parent);
                }
            }
        }

    }


    private void createAddressesFromDto(PersonInfo cp){
        List<PersonAddress> addresses = new ArrayList<>();
        if(cp.getAddressesDto() != null ){
            for (AddressCellBasedDto dto : cp.getAddressesDto()){
                PersonAddress model = new PersonAddress();
                convertAdrDtoToAdr(dto,model);
                model.setAddressType(dto.getAddressType());
                addresses.add(model);
            }
            addresses.forEach(addr -> addr.setPerson(cp));
            cp.setAddresses(addresses);
        }
    }

    private void createAddressFromDto(PersonParent personParent){
        if (personParent.getAddressDto() != null){
            PersonParentAddress model = new PersonParentAddress();
            convertAdrDtoToAdr(personParent.getAddressDto(),model);
            model.setAddressType(personParent.getAddressDto().getAddressType());
            model.setPersonParent(personParent);
            personParent.setAddress(model);
        }
    }

    private void cleanFutureDocs(Person person){

        if(person!=null && person.getFutures_info()!=null){
            for (PersonFutures pf: person.getFutures_info()){
                if (pf.getDoc1() != null && pf.getDoc1().getName() == null){
                    pf.setDoc1(null);
                }
                if (pf.getDoc2() != null && pf.getDoc2().getName() == null){
                    pf.setDoc2(null);
                }
                if (pf.getDoc3() != null && pf.getDoc3().getName() == null){
                    pf.setDoc3(null);
                }
            }
        }

    }
}
