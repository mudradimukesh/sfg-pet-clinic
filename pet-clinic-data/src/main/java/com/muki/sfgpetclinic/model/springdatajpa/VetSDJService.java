package com.muki.sfgpetclinic.model.springdatajpa;

import com.muki.sfgpetclinic.model.Services.VetService;
import com.muki.sfgpetclinic.model.Vet;
import com.muki.sfgpetclinic.model.repositories.VetRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class VetSDJService implements VetService {

    private final VetRepository vetRepository;

    public VetSDJService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets= new HashSet<Vet>();
        vetRepository.findAll().forEach(vet -> {
            vets.add(vet);
        });
        return vets;
    }

    @Override
    public Vet findById(Long aLong) {
        return vetRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
    vetRepository.deleteById(aLong);
    }
}
