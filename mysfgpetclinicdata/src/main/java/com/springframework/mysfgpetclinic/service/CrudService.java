package com.springframework.mysfgpetclinic.service;

import java.util.Set;

public interface CrudService<T,Id> {

    public Set<T> findAll();
    public T save(T object);
    T findById(Id id);
    public void delete(T object);
    public void deleteById(Id id);
}
