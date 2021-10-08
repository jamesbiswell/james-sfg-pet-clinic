package com.jamesbiswell.jamessfgpetclinic.services;

import com.jamesbiswell.jamessfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findbyId(Long id);

    Set<Owner> findAll();

    Owner save (Owner owner);

}
