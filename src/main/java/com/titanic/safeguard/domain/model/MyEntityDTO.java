package com.titanic.safeguard.domain.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class MyEntityDTO {
    private Long id;
    private String field;
}
