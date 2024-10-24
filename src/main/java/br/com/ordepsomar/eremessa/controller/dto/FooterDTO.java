package br.com.ordepsomar.eremessa.controller.dto;

import br.com.ordepsomar.eremessa.entity.Periodico;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FooterDTO {
    private Long id;
    private String tp_registro;
    private String qtd_total;
    private String peso_total;
    private String uni_medida;
    private Long periodico_id;
}
