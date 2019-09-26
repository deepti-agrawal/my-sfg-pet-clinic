package com.springframework.mysfgpetclinic.repositaries;

import com.springframework.mysfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
