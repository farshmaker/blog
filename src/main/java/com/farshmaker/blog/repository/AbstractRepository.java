package com.farshmaker.blog.repository;

/**
 * @author e.karachun
 * @version 30.11.2017
 */
public interface AbstractRepository<T> {

    T save (T object);
}
