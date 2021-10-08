package com.jamesbiswell.jamessfgpetclinic.services;

import com.jamesbiswell.jamessfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findbyId(Long id);

    Set<Pet> findAll();

    Pet save (Pet pet);

}
