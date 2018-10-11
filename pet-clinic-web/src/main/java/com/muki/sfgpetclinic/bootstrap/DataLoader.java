package com.muki.sfgpetclinic.bootstrap;

import com.muki.sfgpetclinic.model.Owner;
import com.muki.sfgpetclinic.model.Vet;
import org.springframework.boot.CommandLineRunner;
import com.muki.sfgpetclinic.model.Services.OwnerService;
import com.muki.sfgpetclinic.model.Services.VetService;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner owner0= new Owner();
        owner0.setId(1L);
        owner0.setFirstName("Muki");
        owner0.setLastName("Weston   ");
        ownerService.save(owner0);

        Owner owner2= new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fionnna");
        owner2.setLastName("Pinto");
        ownerService.save(owner2);

        Vet vet0=new Vet();
        vet0.setId(1L);
        vet0.setFirstName("sam");
        vet0.setLastName("fertet   ");
        vetService.save(vet0);

        Vet vet2=new Vet();
        vet2.setId(1L);
        vet2.setFirstName("fatiha");
        vet2.setLastName("hill");
        vetService.save(vet2);

    }

//    public DataLoader() {
//        this.ownerService = new OwnerServiceMap();
//        this.vetService = new VetServiceMap();
//    }
}
