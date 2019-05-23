package com.yishan.forms.api;


import com.yishan.forms.domain.User;
import com.yishan.forms.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@Repository
@RequestMapping(value = {"/api/users", "/api/user"}, produces = MediaType.APPLICATION_JSON_VALUE)
public class SignUp {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Qualifier(BeanIds.AUTHENTICATION_MANAGER)
    private AuthenticationManager authenticationManager;

    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUserList() {
        logger.debug("List Users!");
        return null;
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public void generateUser(@RequestBody User user) {
        userService.createNewUser(user);
    }

    @RequestMapping(value = "/{Id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable("Id") Long userId) {
        logger.debug("list users by id:" + userId);
        User result = userService.findById(userId);
        return result;
    }
}
