package com.raynermdz.sfgpetclinic.bootstrap;

import com.raynermdz.sfgpetclinic.model.Owner;
import com.raynermdz.sfgpetclinic.model.Pet;
import com.raynermdz.sfgpetclinic.model.PetType;
import com.raynermdz.sfgpetclinic.model.Vet;
import com.raynermdz.sfgpetclinic.services.OwnerService;
import com.raynermdz.sfgpetclinic.services.PetTypeService;
import com.raynermdz.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

  private final OwnerService ownerService;
  private final VetService vetService;
  private final PetTypeService petTypeService;

  public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
    this.ownerService = ownerService;
    this.vetService = vetService;
    this.petTypeService = petTypeService;
  }

  @Override
  public void run(String... args) throws Exception {

    Owner owner = new Owner();
    owner.setFirstName("Rayner");
    owner.setLastName("Mendez");
    owner.setAddress("123 Brickerel");
    owner.setCity("Miami");
    owner.setTelephone("123456789");
    ownerService.save(owner);

    Owner owner2 = new Owner();
    owner2.setFirstName("Emmanuel");
    owner2.setLastName("Garcia");
    owner2.setAddress("123 Brickerel");
    owner2.setCity("Miami");
    owner2.setTelephone("123456789");
    ownerService.save(owner2);

    System.out.println("Owners loaded!");

    /*
     */
    Vet vet = new Vet();
    vet.setFirstName("Sam");
    vet.setLastName("Axe");
    vetService.save(vet);

    Vet vet2 = new Vet();
    vet2.setFirstName("Jessie");
    vet2.setLastName("Porter");
    vetService.save(vet2);

    System.out.println("Vets loaded!");

    /*
     */
    PetType dog = new PetType();
    dog.setName("Dog");
    PetType savedDogPetType = petTypeService.save(dog);

    PetType cat = new PetType();
    dog.setName("Cat");
    PetType savedCatPetType = petTypeService.save(cat);

    System.out.println("PetTypes loaded!");

    /*
     */
    Pet mikesPet = new Pet();
    mikesPet.setPetType(savedDogPetType);
    mikesPet.setOwner(owner);
    mikesPet.setBirthDate(LocalDate.now());
    mikesPet.setName("Rosco");
    owner.getPets().add(mikesPet);

    Pet fionasCat = new Pet();
    fionasCat.setPetType(savedCatPetType);
    fionasCat.setOwner(owner2);
    fionasCat.setBirthDate(LocalDate.now());
    fionasCat.setName("Kitty");
    owner.getPets().add(fionasCat);

    System.out.println("Pet loaded!");

  }
}
