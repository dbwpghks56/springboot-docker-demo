package net.javaguides.dockerdemo.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.javaguides.dockerdemo.presentation.dto.response.StoreResponseDto;

@Entity
@Table(name = "tb_store")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String code;

    private Long price;

    public StoreResponseDto toResponseDto() {
        return StoreResponseDto.builder()
                .id(this.id)
                .name(this.name)
                .description(this.description)
                .code(this.code)
                .price(this.price)
                .build();
    }
}
