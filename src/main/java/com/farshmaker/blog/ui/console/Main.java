package com.farshmaker.blog.ui.console;

import com.farshmaker.blog.domain.User;
import com.farshmaker.blog.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author e.karachun
 * @version 28.11.2017
 */
public class Main {
    public static void main(String[] args) {
        run();
    }

    private static void run() {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = ctx.getBean(UserService.class);

        User newUser = new User();
        newUser.setEmail("bhvbhv@gmail.com");
        newUser.setNickName("admin");

        userService.save(newUser);

    }
}
