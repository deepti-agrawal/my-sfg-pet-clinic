package com.springframework.mysfgpetclinic.service;

import com.springframework.mysfgpetclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner,Long> {

    public Owner findOwnerByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);

    Owner findByLastName(String lastName);
}
