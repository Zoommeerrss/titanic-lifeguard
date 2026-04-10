package com.titanic.safeguard.application.usecase.impl;

import com.titanic.safeguard.application.usecase.MyEntitySaveUseCase;
import com.titanic.safeguard.domain.mapper.MyEntityMapper;
import com.titanic.safeguard.domain.service.MyEntityService;
import com.titanic.safeguard.infrastructure.entrypoint.api.MyEntityRequest;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class MyEntitySaveUseCaseImpl implements MyEntitySaveUseCase {

    @Inject
    private MyEntityService service;

    @Inject
    private MyEntityMapper mapper;

    @Override
    public void execute(MyEntityRequest request) {
        service.save(mapper.fromRequest(request));
    }
}
