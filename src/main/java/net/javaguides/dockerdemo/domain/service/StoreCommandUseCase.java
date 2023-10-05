package net.javaguides.dockerdemo.domain.service;

import net.javaguides.dockerdemo.presentation.dto.request.StoreRequestDto;
import net.javaguides.dockerdemo.presentation.dto.response.StoreResponseDto;

import java.util.List;

public interface StoreCommandUseCase {
    StoreResponseDto findByCode(String code);
    StoreResponseDto findById(Long id);
    List<StoreResponseDto> findAll();
    StoreResponseDto save(StoreRequestDto storeRequestDto);

}
