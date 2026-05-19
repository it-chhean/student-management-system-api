package com.taskflow.studentmanagement.common.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BaseService<Req, Res, ID> {

    Res save(Req request);

    List<Res> saveAll(List<Req> requests);

    Optional<Res> findById(ID id);

    Page<Res> findAll(Pageable pageable);

    boolean existsById(ID id);

    long count();

    void deleteById(ID id);

    void delete(ID id);

    void deleteAll();

    Res activate(ID id);

    Res deactivate(ID id);

    List<Res> findAllActive();

    Page<Res> findAllActive(Pageable pageable);

    Optional<Res> findByIdAndActive(ID id, boolean active);

}
