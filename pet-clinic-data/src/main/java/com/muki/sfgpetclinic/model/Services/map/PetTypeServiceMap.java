package com.muki.sfgpetclinic.model.Services.map;


import com.muki.sfgpetclinic.model.PetType;
import com.muki.sfgpetclinic.model.Services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType,Long> implements PetTypeService{


    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        delete(object);

    }

    @Override
    public void deleteById(Long id) {
        deleteById(id);

    }
}
