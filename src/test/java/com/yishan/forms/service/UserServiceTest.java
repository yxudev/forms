package com.yishan.forms.service;


import com.yishan.forms.config.AppConfig;
import com.yishan.forms.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@WebAppConfiguration
@ContextConfiguration(classes = {AppConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("unit")
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    @Transactional
    public void createNewUserTest() {
        User user = new User();
        user.setUsername("admin");
        user.setEmail("asikx@kjsaxl.com");
        User testUser = userService.createNewUser(user);
        assertNotNull(testUser);
        assertEquals(user, testUser);
    }

//    @Test
//    @Transactional
//    public void findByIdTest() {
//        User user = new User();
//        user.setUsername("Tesla");
//        user.setEmail("sedan@fox.com");
//        User testUser = userService.findById(user.getId());
//        assertNotNull(testUser);
//        assertEquals(user.getId(), testUser.getId());
//    }
}
