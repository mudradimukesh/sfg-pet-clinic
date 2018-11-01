package com.muki.sfgpetclinic.model.Services.map;

import com.muki.sfgpetclinic.model.Pet;
import com.muki.sfgpetclinic.model.Services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        delete(object);

    }

    @Override
    public void deleteById(Long id) {
        deleteById(id);

    }
}