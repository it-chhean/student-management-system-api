package com.taskflow.studentmanagement.common.service;

import com.taskflow.studentmanagement.common.domain.BaseEntity;
import com.taskflow.studentmanagement.common.repository.BaseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.naming.directory.InitialDirContext;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@RequiredArgsConstructor
public abstract class BaseServiceImpl<T extends BaseEntity, ID> implements BaseService<T, ID> {

    private final BaseRepository<T, ID>  repository;

    @Override
    public T save(T entity) {
        return repository.save(entity);
    }

    @Override
    public List<T> saveAll(List<T> entities) {
       return repository.saveAll(entities);
    }

    @Override
    public Optional<T> findById(ID id) {
        return repository.findById(id);
    }

    @Override
    public Page<T> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public boolean existsById(ID id) {
        return repository.existsById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public T activate(ID id) {
        return repository.findById(id)
                .map(entity -> {
                   entity.setActive(true);
                   return repository.save(entity);
                })
                .orElseThrow(() -> new RuntimeException("Entity not found with id: " + id));
    }

    @Override
    public T deactivate(ID id) {
        return repository.findById(id)
                .map(entity -> {
                    entity.setActive(false);
                    return repository.save(entity);
                })
                .orElseThrow(() -> new RuntimeException("Entity not found with id: " + id));
    }

    @Override
    public Page<T> findAllActive(Pageable pageable) {
        return repository.findAllByActive(true, pageable);
    }

    @Override
    public Optional<T> findByIdAndActive(ID id, boolean active) {
        return repository.findByIdAndActive(id, active);
    }
}
