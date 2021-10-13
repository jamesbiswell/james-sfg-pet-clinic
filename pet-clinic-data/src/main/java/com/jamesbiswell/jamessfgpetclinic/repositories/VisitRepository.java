package com.jamesbiswell.jamessfgpetclinic.repositories;

import com.jamesbiswell.jamessfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
