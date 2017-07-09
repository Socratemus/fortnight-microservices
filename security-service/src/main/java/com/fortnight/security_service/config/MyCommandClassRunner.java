package com.fortnight.security_service.config;

import com.fortnight.security_service.model.Authority;
import com.fortnight.security_service.model.AuthorityName;
import com.fortnight.security_service.model.User;
import com.fortnight.security_service.repository.AuthorityRepository;
import com.fortnight.security_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class MyCommandClassRunner implements CommandLineRunner {

    @Autowired
    UserRepository repository;

    @Autowired
    AuthorityRepository authorityRepository;


    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Running the command line runner...");

        User user = new User();
        user.setUsername("Jack");
        user.setPassword("password");
        user.setFirstname("Jack");
        user.setLastname("Sparrow");
        user.setEmail("jack.sparrow@gmail.com");
        user.setEnabled(true);
        user.setLastPasswordResetDate(new Date());

        Authority user_role = new Authority();
        user_role.setId(1L);
        user_role.setName(AuthorityName.ROLE_USER);

        Authority admin_role = new Authority();
        admin_role.setId(2L);
        admin_role.setName(AuthorityName.ROLE_ADMIN);

        authorityRepository.save(user_role);
        authorityRepository.save(admin_role);

        user.setAuthorities(Arrays.asList(user_role, admin_role));

        repository.save(user);
    }
}
