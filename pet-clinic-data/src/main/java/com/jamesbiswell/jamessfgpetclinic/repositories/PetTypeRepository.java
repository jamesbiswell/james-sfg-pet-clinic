package com.jamesbiswell.jamessfgpetclinic.repositories;

import com.jamesbiswell.jamessfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
