package br.com.ordepsomar.eremessa.controller.dto;

import br.com.ordepsomar.eremessa.entity.Periodico;

public record CreateDetalheDto(Periodico periodico, String tp_registro, String uf, int qtd) {
}
