package com.taskflow.studentmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.taskflow.studentmanagement.common.domain.BaseEntity;

public interface BaseService<T extends BaseEntity, ID> {
    
    T save(T entity);

    List<T> saveAll(List<T> entities);

    Optional<T> findById(ID id);

    List<T> findAll();

    Page<T> findAll(Pageable pageable);

    boolean existsById(ID id);

    long count();

    void deleteById(ID id);

    void delete(T entity);

    void deleteAll();

    T activate(ID id);

    T deactivate(ID id);

    List<T> findAllActive();

    Page<T> findAllActive(Pageable pageable);

    Optional<T> findByIdAndActive(ID id, boolean active);
}
