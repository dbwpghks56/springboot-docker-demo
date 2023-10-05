package net.javaguides.dockerdemo.domain.repository;

import net.javaguides.dockerdemo.domain.Store;

import java.util.List;
import java.util.Optional;

public interface StoreRepository {
    Optional<Store> findByCode(String code);
    Optional<Store> findById(Long id);
    List<Store> findByAll();
    Store save(Store store);
}
