package net.javaguides.dockerdemo.application;

import lombok.RequiredArgsConstructor;
import net.javaguides.dockerdemo.domain.service.StoreService;
import net.javaguides.dockerdemo.presentation.dto.request.StoreRequestDto;
import net.javaguides.dockerdemo.presentation.dto.response.StoreResponseDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StoreFacade {
    private final StoreService storeService;

    public StoreResponseDto findByCode(String code) {
        return storeService.findByCode(code);
    }

    public StoreResponseDto findById(Long id) {
        return storeService.findById(id);
    }

    public List<StoreResponseDto> findAll() {
        return storeService.findAll();
    }

    public StoreResponseDto save(StoreRequestDto storeRequestDto) {
        return storeService.save(storeRequestDto);
    }
}
