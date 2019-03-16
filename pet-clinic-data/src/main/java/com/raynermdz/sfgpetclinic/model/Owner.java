package com.raynermdz.sfgpetclinic.model;

import lombok.*;
import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "owners")
public class Owner extends Person {

  @Builder
  public Owner(Long id, String firstName, String lastName, String address, String city, String telephone, Set<Pet> pets) {
    super(id, firstName, lastName);
    this.address = address;
    this.city = city;
    this.telephone = telephone;
    this.pets = pets;
  }

  @Column(name = "address")
  private String address;

  @Column(name = "city")
  private String city;

  @Column(name = "telephone")
  private String telephone;

  // if the owner of a pet is deleted, then the pet will be deleted
  // as well.
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
  private Set<Pet> pets = new HashSet<>();

}
