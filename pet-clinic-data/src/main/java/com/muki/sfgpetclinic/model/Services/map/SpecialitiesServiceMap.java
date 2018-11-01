package com.muki.sfgpetclinic.model.Services.map;

import com.muki.sfgpetclinic.model.Services.SpecialitiesService;
import com.muki.sfgpetclinic.model.Speciality;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class SpecialitiesServiceMap extends  AbstractMapService<Speciality,Long> implements SpecialitiesService {
    @Override
    public Set<Speciality> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void delete(Speciality object) {
 super.delete(object);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
