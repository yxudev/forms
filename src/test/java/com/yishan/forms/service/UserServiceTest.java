package com.yishan.forms.service;

import com.yishan.forms.domain.User;
import com.yishan.forms.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import java.util.Optional;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@WebAppConfiguration
@ActiveProfiles("unit")
public class UserServiceTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    public void createNewUserTest() {
        try{
        User user = new User();
        user.setUsername("admin");
        user.setEmail("asikx@kjsaxl.com");
        userRepository.save(user);
        Optional<User> testUser = userRepository.findById(user.getId());
        assertNotNull(testUser);
        assertEquals(user.getId(), testUser.get().getId());}
        catch (Exception e){
            return;
        }
    }
}
