package com.taskflow.studentmanagement.mapper;

import java.util.List;
import org.mapstruct.*;

public interface BaseMapper<E, RQ, RS>{

    /**
     * Create: DTO -> Entity
     * */
    @Mapping(target = "id", ignore = true)
    E toEntity(RQ request);

    /**
     *  Entity -> Response DTO
     * */
    RS toResponse(E entity);

    List<RS> toResponseList(List<E> entities);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    @Mapping(target = "id", ignore = true)
    void partialUpdate(RQ request, @MappingTarget E entity);

}
