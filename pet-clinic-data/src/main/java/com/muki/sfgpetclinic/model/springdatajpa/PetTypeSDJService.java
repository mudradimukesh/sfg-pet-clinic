package com.muki.sfgpetclinic.model.springdatajpa;

import com.muki.sfgpetclinic.model.PetType;
import com.muki.sfgpetclinic.model.Services.PetTypeService;
import com.muki.sfgpetclinic.model.repositories.PetTypeRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class PetTypeSDJService implements PetTypeService {
    private final PetTypeRepository petTypeRepository;

    public PetTypeSDJService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
         Set<PetType> types= new HashSet<PetType>();
        petTypeRepository.findAll().forEach(type -> {
            types.add(type);
        });
        return types;
    }

    @Override
    public PetType findById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType object) {
petTypeRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);

    }
}
