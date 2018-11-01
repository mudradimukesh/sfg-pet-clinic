package com.muki.sfgpetclinic.model.springdatajpa;

import com.muki.sfgpetclinic.model.Services.SpecialitiesService;
import com.muki.sfgpetclinic.model.Speciality;
import com.muki.sfgpetclinic.model.repositories.SpecialityRepsitory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class SpecialitySDJService implements SpecialitiesService {
    private final SpecialityRepsitory specialityRepsitory;

    public SpecialitySDJService(SpecialityRepsitory specialityRepsitory) {
        this.specialityRepsitory = specialityRepsitory;
    }

    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialities= new HashSet<>();
        specialityRepsitory.findAll().forEach(speciality -> {
            specialities.add(speciality);
        });
        return specialities;
    }

    @Override
    public Speciality findById(Long aLong) {
        return specialityRepsitory.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepsitory.save(object);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepsitory.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepsitory.deleteById(aLong);

    }
}
