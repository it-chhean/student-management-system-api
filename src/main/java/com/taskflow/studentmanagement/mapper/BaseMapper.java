package com.taskflow.studentmanagement.mapper;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

import com.taskflow.studentmanagement.domain.BaseEntity;
import com.taskflow.studentmanagement.io.BaseRequestDTO;
import com.taskflow.studentmanagement.io.BaseResponseDTO;

public interface BaseMapper<E extends BaseEntity, 
                            Q extends BaseRequestDTO,
                            R extends BaseResponseDTO>{
    E toEntity(Q request);

    R toResponse(E entity);

    List<R> toResponseList(List<E> entities);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void partailUpdate(Q request, @MappingTarget E entity);
}
