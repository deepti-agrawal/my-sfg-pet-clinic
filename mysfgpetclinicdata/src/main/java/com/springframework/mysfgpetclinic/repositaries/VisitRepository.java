package com.springframework.mysfgpetclinic.repositaries;

import com.springframework.mysfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
