package com.raynermdz.sfgpetclinic.bootstrap;

import com.raynermdz.sfgpetclinic.model.Owner;
import com.raynermdz.sfgpetclinic.model.Vet;
import com.raynermdz.sfgpetclinic.services.OwnerService;
import com.raynermdz.sfgpetclinic.services.VetService;
import com.raynermdz.sfgpetclinic.services.map.OwnerServiceMapImpl;
import com.raynermdz.sfgpetclinic.services.map.VetServiceMapImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;

  public DataLoader(OwnerService ownerService, VetService vetService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
  }

  @Override
  public void run(String... args) throws Exception {

    Owner owner = new Owner();
    owner.setFirstName("Rayner");
    owner.setLastName("Mendez");
    ownerService.save(owner);

    Owner owner2 = new Owner();
    owner2.setFirstName("Emmanuel");
    owner2.setLastName("Garcia");
    ownerService.save(owner2);

    System.out.println("Owners loaded!");

    Vet vet = new Vet();
    vet.setFirstName("Sam");
    vet.setLastName("Axe");
    vetService.save(vet);

    Vet vet2 = new Vet();
    vet2.setFirstName("Jessie");
    vet2.setLastName("Porter");
    vetService.save(vet2);

    System.out.println("Vets loaded!");


  }
}
