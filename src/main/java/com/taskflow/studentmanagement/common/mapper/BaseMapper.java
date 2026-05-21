package com.taskflow.studentmanagement.common.mapper;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapping;

public interface BaseMapper<E, Req, Res> {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    E toEntity(Req request);

    Res toResponse(E entity);

}
