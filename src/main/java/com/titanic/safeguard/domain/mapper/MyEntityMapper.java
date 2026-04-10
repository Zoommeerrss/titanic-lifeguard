package com.titanic.safeguard.domain.mapper;

import com.titanic.safeguard.domain.model.MyEntityDTO;
import com.titanic.safeguard.infrastructure.datastore.entity.MyEntity;
import com.titanic.safeguard.infrastructure.entrypoint.api.MyEntityRequest;
import com.titanic.safeguard.infrastructure.entrypoint.api.MyEntityResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "cdi") // importante para Quarkus
public interface MyEntityMapper {

    MyEntityDTO toDto(MyEntity entity);
    MyEntity toEntity(MyEntityDTO dto);

    // API
    @Mapping(target = "id", ignore = true) // ignora o ID ao criar a entidade
    MyEntityDTO fromRequest(MyEntityRequest request);
    MyEntityResponse toResponse(MyEntityDTO dto);

    // Conversão de lista
    List<MyEntityDTO> toDtoList(List<MyEntity> entities);
    List<MyEntity> toEntityList(List<MyEntityDTO> dtos);
    List<MyEntityResponse> toResponseList(List<MyEntityDTO> dtos);

}
