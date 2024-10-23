package br.com.ordepsomar.eremessa.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DetalheDTO{
    private Long id;
    private String tp_registro;
    private String uf;
    private int qtd;
    private PeriodicoDTO periodico;
}
