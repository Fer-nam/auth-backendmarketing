package com.mochimochi.backcrudmarketing.dto;

import com.mochimochi.backcrudmarketing.model.TipoUser;

public record RegisterDTO(String email, String senha, TipoUser tipo) {
}
