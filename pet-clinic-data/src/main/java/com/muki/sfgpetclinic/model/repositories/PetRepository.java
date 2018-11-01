package com.muki.sfgpetclinic.model.repositories;

import com.muki.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
