package com.titanic.safeguard.application.usecase.impl;

import com.titanic.safeguard.application.usecase.MyEntityFindAllUseCase;
import com.titanic.safeguard.domain.mapper.MyEntityMapper;
import com.titanic.safeguard.domain.service.MyEntityService;
import com.titanic.safeguard.infrastructure.entrypoint.api.MyEntityResponse;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class MyEntityFindAllUseCaseImpl implements MyEntityFindAllUseCase {

    @Inject
    private MyEntityService service;

    @Inject
    private MyEntityMapper mapper;

    @Override
    public List<MyEntityResponse> execute() {
        return mapper.toResponseList(service.findAll());
    }
}
