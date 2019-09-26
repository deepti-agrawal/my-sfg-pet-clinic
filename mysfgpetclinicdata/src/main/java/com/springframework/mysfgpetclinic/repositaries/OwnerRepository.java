package com.springframework.mysfgpetclinic.repositaries;

import com.springframework.mysfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findOwnerByLastName(String lastName);
}
