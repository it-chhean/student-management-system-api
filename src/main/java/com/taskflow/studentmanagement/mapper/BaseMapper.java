package com.taskflow.studentmanagement.mapper;

import org.mapstruct.Mapping;

public interface BaseMapper<E, Req, Res> {
   
    E toEntity(Req req);

    @Mapping(target = "id", ignore = true) 
    @Mapping(target = "createdAt", ignore = true) 
    @Mapping(target = "updatedAt", ignore = true) 
    Res toResponse(E e);
}
