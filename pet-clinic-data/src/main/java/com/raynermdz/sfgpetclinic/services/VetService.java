package com.raynermdz.sfgpetclinic.services;

import com.raynermdz.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

  Vet findById(Long id);
  Vet save(Vet vet);
  Vet findByLastName(String lastName);
  Set<Vet> findAll();
}
