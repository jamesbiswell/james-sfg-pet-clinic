package com.jamesbiswell.jamessfgpetclinic.services;

import com.jamesbiswell.jamessfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findbyId(Long id);

    Set<Vet> findAll();

    Vet save (Vet vet);

}
