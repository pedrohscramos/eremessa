package br.com.ordepsomar.eremessa.service.impl;

import br.com.ordepsomar.eremessa.controller.dto.CreateDetalheDto;
import br.com.ordepsomar.eremessa.controller.dto.DetalheDTO;
import br.com.ordepsomar.eremessa.controller.dto.PeriodicoDTO;
import br.com.ordepsomar.eremessa.entity.Detalhe;
import br.com.ordepsomar.eremessa.entity.Periodico;
import br.com.ordepsomar.eremessa.repository.DetalheRepository;
import br.com.ordepsomar.eremessa.repository.PeriodicoRepository;
import br.com.ordepsomar.eremessa.service.DetalheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DetalheServiceImpl implements DetalheService {

    @Autowired
    private DetalheRepository detalheRepository;
    @Autowired
    private PeriodicoRepository periodicoRepository;

    @Override
    public DetalheDTO saveDetalhe(DetalheDTO detalheDTO) {

        Detalhe detalhe = convertToEntity(detalheDTO);
        Detalhe savedDetalhe = detalheRepository.save(detalhe);
        return convertToDTO(savedDetalhe);

    }

    private Detalhe convertToEntity(DetalheDTO detalheDTO) {
        Detalhe detalhe = new Detalhe();
        detalhe.setTp_registro(detalheDTO.getTp_registro());
        detalhe.setUf(detalheDTO.getUf());
        detalhe.setQtd(detalheDTO.getQtd());

        Periodico periodico = new Periodico();
        if(detalheDTO.getPeriodico() != null){
           periodico.setId(detalheDTO.getPeriodico().getId());
        }

       detalhe.setPeriodico(periodico);

       return detalhe;
    }

    private DetalheDTO convertToDTO(Detalhe detalhe){

        DetalheDTO detalheDTO = new DetalheDTO();
        detalheDTO.setId(detalhe.getId());
        detalheDTO.setTp_registro(detalhe.getTp_registro());
        detalheDTO.setUf(detalhe.getUf());
        detalheDTO.setQtd(detalhe.getQtd());


        Periodico periodico = detalhe.getPeriodico();
        if(periodico != null) {

            PeriodicoDTO periodicoDTO = new PeriodicoDTO();
            periodicoDTO.setId(periodico.getId());
            periodicoDTO.setTp_registro(periodico.getTp_registro());
            detalheDTO.setPeriodico(periodicoDTO);
        }
        return detalheDTO;
    }

    @Override
    public List<Detalhe> findAllDetalhes() {
        return List.of();
    }

    @Override
    public Detalhe getDetalheById(Long id) {
        return null;
    }

    @Override
    public Detalhe updateDetalheById(Long id, Detalhe detalhe) {
        return null;
    }

    @Override
    public String deleteDetalheById(Long id) {
        return "";
    }
}
