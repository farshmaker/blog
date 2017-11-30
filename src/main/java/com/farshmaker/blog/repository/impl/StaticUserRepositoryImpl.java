package com.farshmaker.blog.repository.impl;

import com.farshmaker.blog.domain.User;
import com.farshmaker.blog.repository.UserRepository;

import java.io.*;
import java.util.HashMap;

/**
 * @author e.karachun
 * @version 30.11.2017
 */
public class StaticUserRepositoryImpl implements UserRepository, Serializable {

    private static final String FILE_NAME = "user.ser";
    private HashMap<Long, User> staticUserStorage;

    @Override
    public User save(User object) {
        Long key = 1L;

        object.setId(key);
        staticUserStorage.containsKey(key);

        return object;
    }

    private void init() {
        try(FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            staticUserStorage = (HashMap<Long, User>) objectInputStream.readObject();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void destroy() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(staticUserStorage);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
