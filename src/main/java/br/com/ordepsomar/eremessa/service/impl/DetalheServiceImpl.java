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
        detalhe.setTp_registro(detalheDTO.tp_registro());
        detalhe.setUf(detalheDTO.uf());
        detalhe.setQtd(detalheDTO.qtd());

        Periodico periodico = new Periodico();
        if(detalheDTO.periodico() != null){
           periodico.setId(detalheDTO.periodico().id());
        }

       detalhe.setPeriodico(periodico);

       return detalhe;
    }

    private DetalheDTO convertToDTO(Detalhe detalhe){

        Periodico periodico = detalhe.getPeriodico();

        PeriodicoDTO periodicoDTO = new PeriodicoDTO()

        DetalheDTO detalheDTO = new DetalheDTO();
        detalheDTO.setTp_registro(detalhe.getTp_registro());
        detalheDTO.setUf(detalhe.getUf());
        detalheDTO.setQtd(detalhe.getQtd());
        detalheDTO.setPeriodico();



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
