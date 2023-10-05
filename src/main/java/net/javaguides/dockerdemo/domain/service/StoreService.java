package net.javaguides.dockerdemo.domain.service;

import lombok.RequiredArgsConstructor;
import net.javaguides.dockerdemo.domain.Store;
import net.javaguides.dockerdemo.domain.repository.StoreRepository;
import net.javaguides.dockerdemo.presentation.dto.request.StoreRequestDto;
import net.javaguides.dockerdemo.presentation.dto.response.StoreResponseDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class StoreService implements StoreCommandUseCase{
    private final StoreRepository storeRepository;

    @Override
    public StoreResponseDto findByCode(String code) {
        return storeRepository.findByCode(code).orElseThrow().toResponseDto();
    }

    @Override
    public StoreResponseDto findById(Long id) {
        return storeRepository.findById(id).orElseThrow().toResponseDto();
    }

    @Override
    public List<StoreResponseDto> findAll() {
        return storeRepository.findByAll().stream().map(Store::toResponseDto).toList();
    }

    @Override
    public StoreResponseDto save(StoreRequestDto storeRequestDto) {
        Store store = storeRequestDto.toEntity();

        return storeRepository.save(store).toResponseDto();
    }
}
