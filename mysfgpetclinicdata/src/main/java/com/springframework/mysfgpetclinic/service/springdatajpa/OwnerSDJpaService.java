package com.springframework.mysfgpetclinic.service.springdatajpa;

import com.springframework.mysfgpetclinic.model.Owner;
import com.springframework.mysfgpetclinic.repositaries.OwnerRepository;
import com.springframework.mysfgpetclinic.repositaries.PetRepository;
import com.springframework.mysfgpetclinic.repositaries.PetTypeRepository;
import com.springframework.mysfgpetclinic.service.OwnerService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository  ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findOwnerByLastName(String lastName) {
        return null;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().iterator().forEachRemaining(owners::add);
        return owners;
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}
