package com.terminalmock.test.services.entityServices.auth;

import com.terminalmock.test.entities.entity.User;
import com.terminalmock.test.repositories.entityrepo.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Optional;

@Component
@Transactional
public class MyUserDetailSvc implements UserDetailsService {

    @Resource
    UserRepo userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> securityUserOptional = userRepository.findByLoginAndActive(username,true);

        if (!securityUserOptional.isPresent()){
            throw new UsernameNotFoundException(username);
        } else {
            User user = securityUserOptional.get();
            return user;
        }
    }
}
