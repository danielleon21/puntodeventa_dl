package com.dev.puntodeventadl.dtos;

import lombok.Data;

@Data
public class LoginResponse {
    private String token;
    private long expiresIn;
}
