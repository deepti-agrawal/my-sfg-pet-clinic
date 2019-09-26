package com.springframework.mysfgpetclinic.repositaries;

import com.springframework.mysfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet,Long> {
}
