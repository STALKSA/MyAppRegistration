package com.app.myapplication.tests;

import com.app.myapplication.model.entities.User;
import com.app.myapplication.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class UserRepositoryTests {

    @Autowired
    private UserRepository userRepository;


    @Test
    public void testSaveUser(){
        User user = new User();
        user.setUsername("testuser");
        user.setPassword("password2");

        User savedUser = userRepository.save(user);

        assertThat(savedUser).isNotNull();
        assertThat(savedUser.getId()).isNotNull();
        assertThat(savedUser.getUsername()).isEqualTo("testuser");

    }
}
