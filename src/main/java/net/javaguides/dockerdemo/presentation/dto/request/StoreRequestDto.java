package net.javaguides.dockerdemo.presentation.dto.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.javaguides.dockerdemo.domain.Store;

@Getter
@NoArgsConstructor
@ToString
public class StoreRequestDto {
    private String name;
    private String description;
    private String code;
    private Long price;

    public Store toEntity() {
        return Store.builder()
                .name(this.name)
                .description(this.description)
                .code(this.code)
                .price(this.price)
                .build();
    }
}
