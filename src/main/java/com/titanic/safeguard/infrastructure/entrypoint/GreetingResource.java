package com.titanic.safeguard.infrastructure.entrypoint;

import com.titanic.safeguard.application.usecase.MyEntityFindAllUseCase;
import com.titanic.safeguard.application.usecase.MyEntityFindByIdUseCase;
import com.titanic.safeguard.application.usecase.MyEntitySaveUseCase;
import com.titanic.safeguard.infrastructure.entrypoint.api.MyEntityRequest;
import com.titanic.safeguard.infrastructure.entrypoint.api.MyEntityResponse;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;

import java.util.List;

@Path("/api/v1/greeting")
public class GreetingResource {

    @Inject
    private MyEntityFindByIdUseCase findByIdUseCase;

    @Inject
    private MyEntityFindAllUseCase findAllUseCase;

    @Inject
    private MyEntitySaveUseCase saveUseCase;

    // Salvar entidade
    @POST
    @Transactional
    @Consumes("application/json")
    @Produces("application/json")
    public void save(MyEntityRequest request) {
        saveUseCase.execute(request);
    }

    // Buscar por ID
    @GET
    @Path("/{id}")
    @Produces("application/json")
    public MyEntityResponse findById(@PathParam("id") Long id) {
        MyEntityResponse response = findByIdUseCase.execute(id);
        if (response == null) {
            throw new NotFoundException("Entity not found with id " + id);
        }
        return response;
    }

    // Buscar todos
    @GET
    @Produces("application/json")
    public List<MyEntityResponse> findAll() {
        return findAllUseCase.execute();
    }

}
