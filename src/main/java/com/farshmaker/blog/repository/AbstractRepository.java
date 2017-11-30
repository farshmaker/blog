package com.farshmaker.blog.repository;

import java.util.Collection;

/**
 * @author e.karachun
 * @version 30.11.2017
 */
public interface AbstractRepository<T> {

    /**
     * Saving new object to storage or updating existing one
     *
     * @param object object to save
     *
     * @return saved object with assigned id
     */
    T save(T object);

    /**
     * Removing object from storage
     *
     * @param object object to remove
     */
    void remove(T object);

    /**
     * Getting object by id from storage
     *
     * @param id id of the object
     *
     * @return Found object or <code>null</code>
     */
    T getById(Long id);

    /**
     * Getting all objects from storage
     *
     * @return collection of objects
     */
    Collection<T> getAll();
}
