package com.jamesbiswell.jamessfgpetclinic.services;

import com.jamesbiswell.jamessfgpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

}
