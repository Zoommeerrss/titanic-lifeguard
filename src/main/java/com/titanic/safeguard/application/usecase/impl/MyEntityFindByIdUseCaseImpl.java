package com.titanic.safeguard.application.usecase.impl;

import com.titanic.safeguard.application.usecase.MyEntityFindByIdUseCase;
import com.titanic.safeguard.domain.mapper.MyEntityMapper;
import com.titanic.safeguard.domain.service.MyEntityService;
import com.titanic.safeguard.infrastructure.entrypoint.api.MyEntityResponse;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MyEntityFindByIdUseCaseImpl implements MyEntityFindByIdUseCase {

    @Inject
    private MyEntityService service;

    @Inject
    private MyEntityMapper mapper;

    @Override
    public MyEntityResponse execute(Long id) {
        return mapper.toResponse(service.findById(id));
    }
}
