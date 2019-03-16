package com.raynermdz.sfgpetclinic.services.springdatajpa;

import com.raynermdz.sfgpetclinic.model.Speciality;
import com.raynermdz.sfgpetclinic.repositories.SpecialityRepository;
import com.raynermdz.sfgpetclinic.services.SpecialityService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJpaService implements SpecialityService {

  private final SpecialityRepository specialityRepository;

  public SpecialitySDJpaService(SpecialityRepository specialityRepository) {
    this.specialityRepository = specialityRepository;
  }

  @Override
  public Set<Speciality> findAll() {

    Set<Speciality> specialities = new HashSet<>();

    specialityRepository.findAll().forEach(specialities::add);

    return specialities;
  }

  @Override
  public Speciality findById(Long id) {
    return specialityRepository.findById(id).orElse(null);
  }

  @Override
  public Speciality save(Speciality obj) {
    return specialityRepository.save(obj);
  }

  @Override
  public void delete(Speciality obj) {
    specialityRepository.delete(obj);
  }

  @Override
  public void deleteById(Long id) {
    specialityRepository.deleteById(id);
  }
}
