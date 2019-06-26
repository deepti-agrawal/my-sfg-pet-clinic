package com.springframework.mysfgpetclinic.service;

import com.springframework.mysfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {

    public Owner findOwnerByLastName(String lastName);
}
