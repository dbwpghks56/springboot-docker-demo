package net.javaguides.dockerdemo.presentation;

import lombok.RequiredArgsConstructor;
import net.javaguides.dockerdemo.application.StoreFacade;
import net.javaguides.dockerdemo.presentation.dto.request.StoreRequestDto;
import net.javaguides.dockerdemo.presentation.dto.response.StoreResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
@RequiredArgsConstructor
public class StoreRestController {
    private final StoreFacade storeFacade;

    @GetMapping()
    public ResponseEntity<List<StoreResponseDto>> findAll() {
        return ResponseEntity.ok(storeFacade.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<StoreResponseDto> findById(
            @PathVariable Long id
    ) {
        return ResponseEntity.ok(storeFacade.findById(id));
    }

    @GetMapping("/code/{code}")
    public ResponseEntity<StoreResponseDto> findByCode(
            @PathVariable String code
    ) {
        return ResponseEntity.ok(storeFacade.findByCode(code));
    }

    @PostMapping
    public ResponseEntity<StoreResponseDto> save(
            @RequestBody StoreRequestDto storeRequestDto
            ) {
        return new ResponseEntity<>(storeFacade.save(storeRequestDto), HttpStatus.CREATED);
    }
}
