package com.raynermdz.sfgpetclinic.services.map;

import com.raynermdz.sfgpetclinic.model.Speciality;
import com.raynermdz.sfgpetclinic.model.Vet;
import com.raynermdz.sfgpetclinic.services.SpecialityService;
import com.raynermdz.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VetServiceMapImpl extends AbstractMapService<Vet, Long> implements VetService {

  private final SpecialityService specialityService;

  public VetServiceMapImpl(SpecialityService specialityService) {
    this.specialityService = specialityService;
  }

  @Override
  public Set<Vet> findAll() {
    return super.findAll();
  }

  @Override
  public void deleteById(Long id) {
    super.deleteById(id);
  }

  @Override
  public void delete(Vet obj) {
    super.delete(obj);
  }

  @Override
  public Vet save(Vet obj) {

    if (obj.getSpecialities().size() > 0) {
      obj.getSpecialities().forEach(speciality -> {
        if (speciality.getId() == null) {
          Speciality savedSpeciality = specialityService.save(speciality);
          speciality.setId(savedSpeciality.getId());
        }
      });
    }
    return super.save(obj);
  }

  @Override
  public Vet findById(Long id) {
    return super.findById(id);
  }
}
