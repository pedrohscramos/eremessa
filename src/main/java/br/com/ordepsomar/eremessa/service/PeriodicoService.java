package br.com.ordepsomar.eremessa.service;

import br.com.ordepsomar.eremessa.controller.dto.CreatePeriodicoDto;
import br.com.ordepsomar.eremessa.controller.dto.DetalheDTO;
import br.com.ordepsomar.eremessa.controller.dto.PeriodicoDTO;
import br.com.ordepsomar.eremessa.controller.dto.UpdatePeriodicoDto;
import br.com.ordepsomar.eremessa.entity.Periodico;
import br.com.ordepsomar.eremessa.repository.PeriodicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PeriodicoService {

    DetalheDTO savePeriodico(DetalheDTO detalheDTO);
    Periodico updateById(Long id, UpdatePeriodicoDto updatePeriodicoDto);
    List<Periodico> listPeriodicos();
    String deleteById(Long id);

}
