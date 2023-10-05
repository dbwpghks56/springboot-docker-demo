package net.javaguides.dockerdemo.infrastructure.repository;

import net.javaguides.dockerdemo.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StoreJpaRepository extends JpaRepository<Store, Long> {
    Optional<Store> findByCode(String code);
}
