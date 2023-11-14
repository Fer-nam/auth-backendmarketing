package com.mochimochi.backcrudmarketing.model;

public enum TipoUser {
    ADMIN("admin"),
    USER("user");

    private String tipo;

     TipoUser(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
         return tipo;

    }

}
