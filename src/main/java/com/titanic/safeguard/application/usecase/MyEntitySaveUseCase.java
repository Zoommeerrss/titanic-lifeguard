package com.titanic.safeguard.application.usecase;

import com.titanic.safeguard.infrastructure.entrypoint.api.MyEntityRequest;

public interface MyEntitySaveUseCase {
    void execute(MyEntityRequest request);
}
