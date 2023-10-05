package net.javaguides.dockerdemo.infrastructure.repository;

import lombok.RequiredArgsConstructor;
import net.javaguides.dockerdemo.domain.Store;
import net.javaguides.dockerdemo.domain.repository.StoreRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class StoreRepositoryImpl implements StoreRepository {
    private final StoreJpaRepository storeJpaRepository;

    @Override
    public Optional<Store> findByCode(String code) {
        return storeJpaRepository.findByCode(code);
    }

    @Override
    public Optional<Store> findById(Long id) {
        return storeJpaRepository.findById(id);
    }

    @Override
    public List<Store> findByAll() {
        return storeJpaRepository.findAll();
    }

    @Override
    public Store save(Store store) {
        return storeJpaRepository.save(store);
    }
}
