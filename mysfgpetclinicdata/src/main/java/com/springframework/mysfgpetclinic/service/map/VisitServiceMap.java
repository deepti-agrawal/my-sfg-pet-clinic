package com.springframework.mysfgpetclinic.service.map;

import com.springframework.mysfgpetclinic.model.Visit;
import com.springframework.mysfgpetclinic.service.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitServiceMap extends AbstractMapService<Visit,Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findall();
    }

    @Override
    public Visit save(Visit object) {
        return super.save(object);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
