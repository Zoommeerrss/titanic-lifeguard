package com.titanic.safeguard.infrastructure.port.impl;

import com.titanic.safeguard.infrastructure.datastore.entity.MyEntity;
import com.titanic.safeguard.infrastructure.datastore.repository.MyEntityRepository;
import com.titanic.safeguard.infrastructure.port.MyEntityPort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class MyEntityPortImpl implements MyEntityPort {

    @Inject
    private MyEntityRepository repository;

    @Override
    public void save(MyEntity entity) {
        repository.persist(entity);
    }

    @Override
    public MyEntity findById(Long value) {
        return repository.findById(value);
    }

    @Override
    public List<MyEntity> findAll() {
        return repository.findAll().list();
    }
}
