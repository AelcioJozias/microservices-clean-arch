package com.br.jozias.services.partient.application.core.domains;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    private UUID id;
    private String name;
    private String email;
    private String username;
    private String password;
    private int age;

}
