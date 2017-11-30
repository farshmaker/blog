package com.farshmaker.blog.service;

import com.farshmaker.blog.domain.Publication;
import com.farshmaker.blog.domain.User;

import java.util.Set;

/**
 * @author e.karachun
 * @version 28.11.2017
 */
public interface PublicationService extends AbstractDomainObjectService<Publication> {

    /**
     * Getting all publications created by user
     *
     * @param author user whose publications we want to receive
     *
     * @return set of all publications created by user
     */
    Set<Publication> getAllByUser(User author);
}
