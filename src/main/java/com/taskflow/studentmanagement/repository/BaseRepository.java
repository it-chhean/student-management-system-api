package com.taskflow.studentmanagement.repository;

import java.util.List;
import java.util.Optional;

import org.springdoc.core.converters.models.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import com.taskflow.studentmanagement.common.domain.BaseEntity;

@NoRepositoryBean
public interface BaseRepository<T extends BaseEntity, ID> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {

    Optional<T> findByIdAndActive(ID id, boolean active);

    List<T> findAllByActive(boolean active);

    Page<T> findAllByActive(boolean active, Pageable pageable);

    boolean existsByIdAndActive(ID id, boolean active);

    long countByActive(boolean active);

}

