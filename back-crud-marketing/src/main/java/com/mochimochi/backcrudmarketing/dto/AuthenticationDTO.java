package com.mochimochi.backcrudmarketing.dto;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public record AuthenticationDTO(String email, String senha) {


}
