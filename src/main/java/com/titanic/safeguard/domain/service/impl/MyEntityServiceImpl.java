package com.titanic.safeguard.domain.service.impl;

import com.titanic.safeguard.domain.mapper.MyEntityMapper;
import com.titanic.safeguard.domain.model.MyEntityDTO;
import com.titanic.safeguard.domain.service.MyEntityService;
import com.titanic.safeguard.infrastructure.port.MyEntityPort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class MyEntityServiceImpl implements MyEntityService {

    @Inject
    private MyEntityPort port;

    @Inject
    private MyEntityMapper mapper;

    @Override
    public void save(MyEntityDTO entity) {
        port.save(mapper.toEntity(entity));
    }

    @Override
    public MyEntityDTO findById(Long id) {
        return mapper.toDto(port.findById(id));
    }

    @Override
    public List<MyEntityDTO> findAll() {
        return mapper.toDtoList(port.findAll());
    }
}
