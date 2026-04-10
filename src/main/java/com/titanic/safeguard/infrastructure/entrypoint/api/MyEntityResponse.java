package com.titanic.safeguard.infrastructure.entrypoint.api;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class MyEntityResponse {
    private Long id;
    private String field;
}
