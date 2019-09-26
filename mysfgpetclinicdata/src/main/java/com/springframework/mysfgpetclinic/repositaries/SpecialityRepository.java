package com.springframework.mysfgpetclinic.repositaries;

import com.springframework.mysfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
