package com.taskflow.studentmanagement.common.service;

import com.taskflow.studentmanagement.exception.ResourceNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.taskflow.studentmanagement.common.domain.BaseEntity;
import com.taskflow.studentmanagement.common.mapper.BaseMapper;
import com.taskflow.studentmanagement.common.repository.BaseRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public abstract class BaseServiceImpl<E extends BaseEntity, Req, Res, ID,
    R extends BaseRepository<E, ID>,
    M extends BaseMapper<E, Req, Res>> 
    implements BaseService<Req, Res, ID> {

    private final R repository;
    private final M mapper;

    @Override
    public Res save(Req request) {
        E entity = mapper.toEntity(request);
        return mapper.toResponse(repository.save(entity));
    }

    @Override
    public List<Res> saveAll(List<Req> requests) {
        List<E> entities = requests.stream()
                .map(mapper::toEntity)
                .toList();
        return repository.saveAll(entities).stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public Optional<Res> findById(ID id) {
        return repository.findById(id)
                .map(mapper::toResponse);
    }

    @Override
    public Page<Res> findAll(Pageable pageable) {
        return repository.findAll(pageable)
                .map(mapper::toResponse);
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
        E entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Resource not found with id: " + id
                ));
        entity.setActive(false);
        repository.save(entity) ;
    }

    @Override
    public void delete(ID id) {
        E entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(
                        "Resource not found with id: " + id
                ));
        repository.delete(entity);
    }

    @Override
    public void deleteAll() {
        List<E> entities = repository.findAll();
        entities.forEach(entity -> entity.setActive(false));
        repository.saveAll(entities);
    }

    @Override
    public Res activate(ID id) {
        return repository.findById(id)
                .map(e -> {
                   e.setActive(true);
                   return mapper.toResponse(repository.save(e));
                })
                .orElseThrow(() -> new ResourceNotFoundException("Resource not found with id: " + id ));
    }

    @Override
    public Res deactivate(ID id) {
        return repository.findById(id)
                .map(e -> {
                    e.setActive(false);
                    return mapper.toResponse(repository.save(e));
                })
                .orElseThrow(() -> new ResourceNotFoundException("Resource not found with id: " + id));
    }

    @Override
    public List<Res> findAllActive() {
        return repository.findAllByActive(true).stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public Page<Res> findAllActive(Pageable pageable) {
        return repository.findAllByActive(true, pageable)
                .map(mapper::toResponse);
    }

    @Override
    public Optional<Res> findByIdAndActive(ID id, boolean active) {
        return repository.findByIdAndActive(id, active)
                .map(mapper::toResponse);
    }
}
