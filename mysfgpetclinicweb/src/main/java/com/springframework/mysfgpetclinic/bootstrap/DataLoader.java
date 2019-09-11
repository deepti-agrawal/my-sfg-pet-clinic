package com.springframework.mysfgpetclinic.bootstrap;

import com.springframework.mysfgpetclinic.model.Owner;
import com.springframework.mysfgpetclinic.model.Pet;
import com.springframework.mysfgpetclinic.model.PetType;
import com.springframework.mysfgpetclinic.model.Vet;
import com.springframework.mysfgpetclinic.service.OwnerService;
import com.springframework.mysfgpetclinic.service.PetTypeService;
import com.springframework.mysfgpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService,PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    public void run(String... args){
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDog = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedCat = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Deepti");
        owner1.setLastName("Agrawal");
        owner1.setAddress("725 Wiggens Ferry");
        owner1.setCity("Saint Louis");
        owner1.setTelephone("1234567895");

        Pet mikesPet = new Pet();
        mikesPet.setOwner(owner1);
        mikesPet.setPetType(savedDog);
        mikesPet.setBirthDate(LocalDate.now());
        mikesPet.setName("Rosco");
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Rupesh");
        owner2.setLastName("Jaiswal");
        owner2.setAddress("725 Wiggens Ferry");
        owner2.setCity("Saint Louis");
        owner2.setTelephone("1234567895");

        Pet fioanaCat = new Pet();
        fioanaCat.setName("Cat");
        fioanaCat.setOwner(owner2);
        fioanaCat.setBirthDate(LocalDate.now());
        fioanaCat.setPetType(savedCat);
        owner2.getPets().add(fioanaCat);

        ownerService.save(owner2);
        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");
        vetService.save(vet1);
        Vet vet2 = new Vet();
        vet2.setLastName("Davis");
        vet2.setFirstName("Richard");
        vetService.save(vet2);
        System.out.println("Loaded Vets");
    }
}
