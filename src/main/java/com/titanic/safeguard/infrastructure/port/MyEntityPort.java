package com.titanic.safeguard.infrastructure.port;

import com.titanic.safeguard.infrastructure.datastore.entity.MyEntity;

import java.util.List;

public interface MyEntityPort {

    void save(MyEntity entity);
    MyEntity findById(Long id);
    List<MyEntity> findAll();

}
