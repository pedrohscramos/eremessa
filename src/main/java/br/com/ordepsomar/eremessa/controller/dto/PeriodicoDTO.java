package br.com.ordepsomar.eremessa.controller.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PeriodicoDTO{
        private Long id;
        private String tp_registro;
        private String cod_titulo;
        private String id_periodico;
        private String num_edicao;
        private String tp_periodico;
        private String peso_un;
        private String uni_medida_un;
        private String largura;
        private String altura;
        private String comprimento;
        private String uni_medida_dim;
        private String qtd_amarrado;
        private String qtd_total;
        private String qtd_extra;
        private String legenda;
}
