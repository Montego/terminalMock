//package com.terminalmock.test.services.entityServices;
//
//import com.terminalmock.test.entities.entity.Role;
//import com.terminalmock.test.entities.entity.User;
//import com.terminalmock.test.repositories.entityrepo.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//@Service
//public class UserService implements UserDetailsService {
//
//    private final UserRepo userRepository;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Autowired
//    public UserService(UserRepo userRepository) {
//        this.userRepository = userRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username);
//
//        if(user == null){
//            throw new UsernameNotFoundException("User not found");
//        }
//        return user;
//    }
//
//
//    public List<User> findAll() {
//        return userRepository.findAll();
//    }
//
//
//    public void saveUser(User user, String userName, Map<String, String> form) {
//        user.setUsername(userName);
//        Set<String> roles = Arrays.stream(Role.values())
//                .map(Role::name)
//                .collect(Collectors.toSet());
//
//        user.getRoles().clear();
//
//        for (String key : form.keySet()) {
//            if (roles.contains(key)) {
//                user.getRoles().add(Role.valueOf(key));
//            }
//        }
//        userRepository.save(user);
//    }
//
//    public boolean addUser(User user) {
//        User userfromDataBase = userRepository.findByUsername(user.getUsername());
//        if (userfromDataBase != null) {
//            return false;
//        }
//        user.setActive(true);
//        user.setRoles(Collections.singleton(Role.USER));
////        user.setActivationCode(UUID.randomUUID().toString());
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        userRepository.save(user);
////        sendMessage(user);
//        return true;
//    }
//
//
//}
