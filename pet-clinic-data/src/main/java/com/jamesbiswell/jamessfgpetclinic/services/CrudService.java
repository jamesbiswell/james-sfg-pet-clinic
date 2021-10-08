package com.jamesbiswell.jamessfgpetclinic.services;

import java.util.Set;

public interface CrudService <T, ID> {

    Set<T> findAll();

    T findbyID(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}

