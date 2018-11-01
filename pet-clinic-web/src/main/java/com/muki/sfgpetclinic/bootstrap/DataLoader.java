package com.muki.sfgpetclinic.bootstrap;

import com.muki.sfgpetclinic.model.*;
import com.muki.sfgpetclinic.model.Services.OwnerService;
import com.muki.sfgpetclinic.model.Services.PetTypeService;
import com.muki.sfgpetclinic.model.Services.SpecialitiesService;
import com.muki.sfgpetclinic.model.Services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialitiesService SpecialitiesService;

    public DataLoader(OwnerService ownerService, VetService vetService,PetTypeService petTypeService,SpecialitiesService
            SpecialitiesService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService=petTypeService;
        this.SpecialitiesService=SpecialitiesService;
    }


    @Override
    public void run(String... args) throws Exception {

        loadData();

    }

    private void loadData() {
        PetType dog=new PetType();
        dog.setName("dog");
        PetType savedDogType=petTypeService.save(dog);

        PetType cat=new PetType();
        dog.setName("cat");
        PetType savedCatType=petTypeService.save(cat);

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology = SpecialitiesService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality savedSurgery = SpecialitiesService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("dentistry");
        Speciality savedDentistry = SpecialitiesService.save(dentistry);

        Owner owner0 = new Owner();
//        owner0.setId(1L);     We can automate ID generation using hashpmap
        owner0.setFirstName("Muki");
        owner0.setLastName("Weston   ");
        owner0.setLastName("Weston");
        owner0.setAddress("123 Brickerel");
        owner0.setCity("Miami");
        owner0.setTelephone("1231231234");
        Pet mikesPet = new Pet();
        mikesPet.setPetType(dog);
        mikesPet.setOwner(owner0);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner0.getPets().add(mikesPet);
        ownerService.save(owner0);

        Owner owner2 = new Owner();
//        owner2.setId(2L);
        owner2.setFirstName("Fionnna");
        owner2.setLastName("Glenanne");
        owner2.setAddress("123 Brickerel");
        owner2.setCity("Miami");
        owner2.setTelephone("1231231234");

        Pet fionasCat = new Pet();
        fionasCat.setName("Just Cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(cat);

        ownerService.save(owner2);

        Vet vet0 = new Vet();
//
        vet0.setFirstName("sam");
        vet0.setLastName("fertet");
        vet0.getSpecialities().add(savedRadiology);
        vetService.save(vet0);

        Vet vet2 = new Vet();
//        vet2.setId(2L);
        vet2.setFirstName("fatiha");
        vet2.setLastName("hill");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);
    }

//    public DataLoader() {
//        this.ownerService = new OwnerServiceMap();
//        this.vetService = new VetServiceMap();
//    }
}
