package com.muki.sfgpetclinic.model.Services.map;

import com.muki.sfgpetclinic.model.Owner;
import com.muki.sfgpetclinic.model.Pet;
import com.muki.sfgpetclinic.model.Services.OwnerService;
import com.muki.sfgpetclinic.model.Services.PetService;
import com.muki.sfgpetclinic.model.Services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    PetTypeService petTypeService;
    PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {

        Owner savedOwner=null;
                if(object!=null)
                {
if(object.getPets()!=null)
{
object.getPets().forEach(pet ->{
    if(pet.getPetType()!=null){
        if(pet.getPetType().getId()==null)
        {
           pet.setPetType(petTypeService.save(pet.getPetType()));
        }
    }else{
        throw new RuntimeException(" Pet type Required.");
    }
    if(pet.getId()==null)
    {
        Pet savedPet=petService.save(pet);
        pet.setId(savedPet.getId());
    }
});
}
                    return super.save(object);
                }

        return savedOwner;
    }

    @Override
    public void delete(Owner object) {
        delete(object);

    }

    @Override
    public void deleteById(Long id) {
        deleteById(id);

    }
}
