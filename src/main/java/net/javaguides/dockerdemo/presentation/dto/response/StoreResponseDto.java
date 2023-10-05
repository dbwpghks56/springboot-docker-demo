package net.javaguides.dockerdemo.presentation.dto.response;

import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class StoreResponseDto {
    private Long id;
    private String name;
    private String description;
    private String code;
    private Long price;
}
