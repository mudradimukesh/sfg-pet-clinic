package com.muki.sfgpetclinic.model.Services.map;

import com.muki.sfgpetclinic.model.Services.SpecialitiesService;
import com.muki.sfgpetclinic.model.Services.VetService;
import com.muki.sfgpetclinic.model.Speciality;
import com.muki.sfgpetclinic.model.Vet;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class
VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }
    private SpecialitiesService specialitiesService;

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

        if(object!=null)
        {
            if(object.getSpecialities()!=null)
            {
                object.getSpecialities().forEach(speciality ->{
                    if(speciality.getId()==null)
                    {
                       Speciality savespe=specialitiesService.save(speciality);
                       speciality.setId(savespe.getId());
                    }
                        }
                        );
            }
        }


        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        delete(object);

    }

    @Override
    public void deleteById(Long id) {
        deleteById(id);

    }
}
