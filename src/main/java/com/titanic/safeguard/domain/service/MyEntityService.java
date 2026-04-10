package com.titanic.safeguard.domain.service;

import com.titanic.safeguard.domain.model.MyEntityDTO;

import java.util.List;

public interface MyEntityService {

    void save(MyEntityDTO entity);
    MyEntityDTO findById(Long id);
    List<MyEntityDTO> findAll();

}
