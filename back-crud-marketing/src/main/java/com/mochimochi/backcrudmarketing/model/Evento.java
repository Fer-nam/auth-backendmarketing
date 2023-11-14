package com.mochimochi.backcrudmarketing.model;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity(name="eventos")
@Table(name="eventos")
public class Evento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @NotBlank
    @NotNull
    @Length(min = 5, max = 200)
    @Column(length = 200, nullable = false)
    private String nome;

    @NotNull
    @Length(max = 300)
    @Column(length = 300, nullable = false)
    private String descricao;

    @Column(length = 400, nullable = false)
    private String img;

    @Column(length = 200, nullable = false)
    private String urlEvento;

    //@Column
    //private Boolean like = false;


}
