package com.springframework.mysfgpetclinic.bootstrap;

import com.springframework.mysfgpetclinic.model.Owner;
import com.springframework.mysfgpetclinic.model.Vet;
import com.springframework.mysfgpetclinic.service.OwnerService;
import com.springframework.mysfgpetclinic.service.VetService;
import com.springframework.mysfgpetclinic.service.map.OwnerServiceMap;
import com.springframework.mysfgpetclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    public void run(String... args){
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Deepti");
        owner1.setLastName("Agrawal");
        ownerService.save(owner1);
        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Rupesh");
        owner2.setLastName("Jaiswal");
        ownerService.save(owner2);
        System.out.println("Loaded Owners");
        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);
        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setLastName("Davis");
        vet2.setFirstName("Richard");
        vetService.save(vet2);
        System.out.println("Loaded Vets");
    }
}
