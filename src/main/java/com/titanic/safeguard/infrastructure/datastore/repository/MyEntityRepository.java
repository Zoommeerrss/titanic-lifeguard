package com.titanic.safeguard.infrastructure.datastore.repository;

import com.titanic.safeguard.infrastructure.datastore.entity.MyEntity;
import io.quarkus.hibernate.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public interface MyEntityRepository extends PanacheRepository<MyEntity> {

}


