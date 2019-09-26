package com.springframework.mysfgpetclinic.repositaries;

import com.springframework.mysfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
