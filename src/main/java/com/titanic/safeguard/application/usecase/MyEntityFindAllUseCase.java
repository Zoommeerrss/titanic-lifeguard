package com.titanic.safeguard.application.usecase;

import com.titanic.safeguard.infrastructure.entrypoint.api.MyEntityResponse;

import java.util.List;

public interface MyEntityFindAllUseCase {
    List<MyEntityResponse> execute();
}
