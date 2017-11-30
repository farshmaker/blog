package com.farshmaker.blog.ui.console;

import com.farshmaker.blog.domain.User;
import com.farshmaker.blog.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.Reader;
import java.util.Scanner;

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

        while (true) {
            boolean exit = false;
            System.out.println("1: Register user");
            System.out.println("2: Get all users");
            System.out.println("3: Quit");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    User newUser = new User();

                    System.err.print("Email: ");
                    newUser.setEmail(scanner.next());

                    System.err.print("Nickname: ");
                    newUser.setNickName(scanner.next());

                    userService.save(newUser);
                } break;
                case 2: {
                    userService.getAll().forEach(System.out::println);

                } break;
                case 3:
                    exit = true;
                    break;

            }

            if(exit) {
                break;
            }

        }

        ctx.close();


    }
}
