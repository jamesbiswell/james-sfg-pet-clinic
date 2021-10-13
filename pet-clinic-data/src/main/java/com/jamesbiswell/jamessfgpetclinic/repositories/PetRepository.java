package com.jamesbiswell.jamessfgpetclinic.repositories;

import com.jamesbiswell.jamessfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
