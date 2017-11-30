package com.farshmaker.blog.repository.impl;

import com.farshmaker.blog.domain.User;
import com.farshmaker.blog.repository.UserRepository;

import java.io.*;
import java.util.Collection;
import java.util.HashMap;

/**
 * @author e.karachun
 * @version 30.11.2017
 */
public class StaticUserRepositoryImpl implements UserRepository {

    private static final String FILE_NAME = "user.ser";

    private HashMap<String, User> staticUserStorage;

    @Override
    public User save(User object) {
        staticUserStorage.put(object.getEmail(), object);
        return object;
    }

    @Override
    public void remove(User object) {

    }

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public Collection<User> getAll() {
        return staticUserStorage.values();
    }

    private void init() {
        try (FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            staticUserStorage = (HashMap<String, User>) objectInputStream.readObject();

            if (staticUserStorage == null) {
                staticUserStorage = new HashMap<>();
            }

        } catch (FileNotFoundException e) {
            staticUserStorage = new HashMap<>();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void destroy() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            if(!staticUserStorage.isEmpty()) {
                objectOutputStream.writeObject(staticUserStorage);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
