package com.jamesbiswell.jamessfgpetclinic.services;

import com.jamesbiswell.jamessfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
