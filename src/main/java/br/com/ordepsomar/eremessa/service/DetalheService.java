package br.com.ordepsomar.eremessa.service;


import br.com.ordepsomar.eremessa.controller.dto.CreateDetalheDto;
import br.com.ordepsomar.eremessa.controller.dto.DetalheDTO;
import br.com.ordepsomar.eremessa.entity.Detalhe;
import br.com.ordepsomar.eremessa.entity.Periodico;

import java.util.List;

public interface DetalheService {

    DetalheDTO saveDetalhe(DetalheDTO detalheDTO);
    List<Detalhe> findAllDetalhes();
    Detalhe getDetalheById(Long id);
    Detalhe updateDetalheById(Long id, Detalhe detalhe);
    String deleteDetalheById(Long id);
}
