package com.terminalmock.test.services;


import com.terminalmock.test.entities.entity.PersonInfo;
import com.terminalmock.test.repositories.entityrepo.PersonInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import com.terminalmock.test.model.comparison.SearchElement;
import com.terminalmock.test.model.comparison.SearchForm;
import com.terminalmock.test.model.comparison.SearchParams;
import com.terminalmock.test.model.comparison.SearchSelect;


import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;


import static com.terminalmock.test.repositories.specifications.SearchPersonInfoSpecification.*;

@Service
public class SearchPersonInfoSvc {

    @Autowired
    PersonInfoRepo personInfoRepo;

    //Поиск по набору параметров

    /** Производит поиск свидетельств по указанной структуре параметров.
     * Структура автоматически преобразуется в список внутри функции.
     * Чтобы исключить свойство от участия в фильтрации - необходимо указать null в качестве значения
     *
     * @param params SearchParams - свойства по структуре класса
     * @return Iterable<PersonInfo> - список найденных свидетельств
     */
    public Iterable<PersonInfo> searchMedCerts(SearchParams params, HttpServletRequest request) {

        Integer page = 0;
        Integer size = 20;
        Sort.Direction direction = Sort.Direction.DESC;
        String property = "id";

        //Проверка если входные параметры совпадают с ключевыми, при которых необходимо выводить все доступные сертификаты

        cleanSertsSearchParamsCore(params);

        //

        if (params.getPage()!=null && params.getPage()>0){
            page = params.getPage();
        }

        if (params.getSize()!=null && params.getSize()>0){
            size = params.getSize();
        }

        if (params.getSortDirection() != null && params.getSortDirection().equals("ASC")){
            direction = Sort.Direction.ASC;
        }

        if (!(params.getSortProperty()==null || "".equals(params.getSortProperty()))){
            property = params.getSortProperty();
        }

        Pageable pages = PageRequest.of(page, size, direction, property);

        return personInfoRepo.findAll(specificationForSearch(params),pages);
    }

    public SearchForm getEmptySearchParams(){
        return new SearchForm(true);
    }


//внутренние процедуры

    private Specification<PersonInfo> specificationForSearch(SearchParams params){

        ArrayList<SearchElement> paramsAL = params.toArrayList();

        Specification<PersonInfo> specification  = Specification.where(whereAndStart());
        Specification<PersonInfo> specificationOrNULL;
        for (SearchElement param:paramsAL) {

            if(param.getPropertyName().equals("resolution") && param.getComparisonValue1().equals("нет")) {
                specificationOrNULL = Specification.where(addSearchElement(param));
                specificationOrNULL = specificationOrNULL.or(addIsNULL(param));
                specification = specification.and(specificationOrNULL);
            }else{
                specification = specification.and(addSearchElement(param));
            }

        }

        return specification;

    }

    /** Создаёт и заполняет особый объект SearchParams.
     * Если фронт присылает такой объект это значит, что нужно вернуть все записи.
     * В остальных случаях поиск работает по обычной схеме.
     *
     * @param
     * @return SearchParams - сформированный и заполненный объект SearchParams
     */
    private SearchParams allSertsSearchParamsObject(){

        SearchParams searchParams = new SearchParams();


        SearchSelect tab_personal_firstname = new SearchSelect();
        tab_personal_firstname.setSelect("начинается");
        searchParams.setTab_personal_firstname(tab_personal_firstname);

        SearchSelect tab_personal_lastname = new SearchSelect();
        tab_personal_lastname.setSelect("начинается");
        searchParams.setTab_personal_lastname(tab_personal_lastname);

        SearchSelect tab_personal_middlename = new SearchSelect();
        tab_personal_middlename.setSelect("начинается");
        searchParams.setTab_personal_middlename(tab_personal_middlename);

        searchParams.setPage(0);

        return searchParams;
    }

    /** Очищает объект SearchParams
     * от незаполненных параметров
     */
    private void cleanSertsSearchParamsCore(SearchParams searchParams){

        if (searchParams.getTab_personal_firstname()!= null && ("".equals(searchParams.getTab_personal_firstname().getInput())|| null == searchParams.getTab_personal_firstname().getInput())){
            searchParams.setTab_personal_firstname(null);
        }

        if (searchParams.getTab_personal_lastname()!= null && ("".equals(searchParams.getTab_personal_lastname().getInput())|| null == searchParams.getTab_personal_lastname().getInput())){
            searchParams.setTab_personal_lastname(null);
        }

        if (searchParams.getTab_personal_middlename()!= null && ("".equals(searchParams.getTab_personal_middlename().getInput())|| null == searchParams.getTab_personal_middlename().getInput())){
            searchParams.setTab_personal_middlename(null);
        }

    }

    /** Полностью очищает ядро объекта SearchParams
     * от незаполненных параметров
     */
    private void fullCleanSertsSearchParamsCore(SearchParams searchParams){

        searchParams.setTab_personal_firstname(null);
        searchParams.setTab_personal_lastname(null);
        searchParams.setTab_personal_middlename(null);

    }


}
