package com.titanic.safeguard.application.usecase;

import com.titanic.safeguard.infrastructure.entrypoint.api.MyEntityResponse;

public interface MyEntityFindByIdUseCase {
    MyEntityResponse execute(Long id);
}
