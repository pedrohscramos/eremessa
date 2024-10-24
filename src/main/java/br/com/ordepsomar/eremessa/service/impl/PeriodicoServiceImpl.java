package br.com.ordepsomar.eremessa.service.impl;

import br.com.ordepsomar.eremessa.controller.dto.CreatePeriodicoDto;
import br.com.ordepsomar.eremessa.controller.dto.DetalheDTO;
import br.com.ordepsomar.eremessa.controller.dto.PeriodicoDTO;
import br.com.ordepsomar.eremessa.controller.dto.UpdatePeriodicoDto;
import br.com.ordepsomar.eremessa.entity.Detalhe;
import br.com.ordepsomar.eremessa.entity.Periodico;
import br.com.ordepsomar.eremessa.repository.DetalheRepository;
import br.com.ordepsomar.eremessa.repository.PeriodicoRepository;
import br.com.ordepsomar.eremessa.service.PeriodicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeriodicoServiceImpl implements PeriodicoService {

    @Autowired
    private PeriodicoRepository periodicoRepository;

    @Autowired
    private DetalheRepository detalheRepository;

    @Override
    public DetalheDTO savePeriodico(DetalheDTO detalheDTO) {

        Detalhe detalhe = convertToEntity(detalheDTO);
        Detalhe savedPeriodico = detalheRepository.save(detalhe);
        return convertToDTO(savedPeriodico);

    }

    @Override
    public List<Periodico> listPeriodicos(){
        List<Periodico> allPeriodicos = periodicoRepository.findAll();
        return allPeriodicos;
    }

    @Override
    public String deleteById(Long id){
        if(periodicoRepository.findById(id).isPresent()){
            periodicoRepository.deleteById(id);
            return "Periodico deletado com sucesso!";
        }
        return "Periódico não encontrado";
    }

    public Periodico updateById(Long id, UpdatePeriodicoDto updatePeriodicoDto){

        Optional<Periodico> periodico1 = periodicoRepository.findById(id);

        if(periodico1.isPresent()){
            Periodico periodicoOriginal = periodico1.get();

            if(updatePeriodicoDto.num_edicao() != null){
                periodicoOriginal.setNum_edicao(updatePeriodicoDto.num_edicao());
            }

            if(updatePeriodicoDto.qtd_total() != null){
                periodicoOriginal.setQtd_total(updatePeriodicoDto.qtd_total());
            }

            return periodicoRepository.save(periodicoOriginal);
        }
        return null;
    }

    private Detalhe convertToEntity(DetalheDTO detalheDTO){
        Detalhe detalhe = new Detalhe();
        detalhe.setId(detalheDTO.getId());
        detalhe.setTp_registro(detalheDTO.getTp_registro());
        detalhe.setUf(detalheDTO.getUf());
        detalhe.setQtd(detalheDTO.getQtd());


        Periodico periodico = new Periodico();
        if(detalheDTO.getPeriodico() != null) {
            periodico.setId(detalheDTO.getPeriodico().getId());
            periodico.setTp_registro(detalheDTO.getPeriodico().getTp_registro());
            periodico.setCod_titulo(detalheDTO.getPeriodico().getCod_titulo());
            periodico.setId_periodico(detalheDTO.getPeriodico().getId_periodico());
            periodico.setNum_edicao(detalheDTO.getPeriodico().getNum_edicao());
            periodico.setTp_periodico(detalheDTO.getPeriodico().getTp_periodico());
            periodico.setPeso_un(detalheDTO.getPeriodico().getPeso_un());
            periodico.setUni_medida_un(detalheDTO.getPeriodico().getUni_medida_un());
            periodico.setLargura(detalheDTO.getPeriodico().getLargura());
            periodico.setAltura(detalheDTO.getPeriodico().getAltura());
            periodico.setComprimento(detalheDTO.getPeriodico().getComprimento());
            periodico.setUni_medida_dim(detalheDTO.getPeriodico().getUni_medida_dim());
            periodico.setQtd_amarrado(detalheDTO.getPeriodico().getQtd_amarrado());
            periodico.setQtd_total(detalheDTO.getPeriodico().getQtd_total());
            periodico.setQtd_extra(detalheDTO.getPeriodico().getQtd_extra());
            periodico.setLegenda(detalheDTO.getPeriodico().getLegenda());
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
        if(periodico != null){
            PeriodicoDTO periodicoDTO = new PeriodicoDTO();
            periodicoDTO.setId(periodico.getId());
            periodicoDTO.setTp_registro(periodico.getTp_registro());
            periodicoDTO.setCod_titulo(periodico.getCod_titulo());
            periodicoDTO.setId_periodico(periodico.getId_periodico());
            periodicoDTO.setNum_edicao(periodico.getNum_edicao());
            periodicoDTO.setTp_periodico(periodico.getTp_periodico());
            periodicoDTO.setPeso_un(periodico.getPeso_un());
            periodicoDTO.setUni_medida_un(periodico.getUni_medida_un());
            periodicoDTO.setLargura(periodico.getLargura());
            periodicoDTO.setAltura(periodico.getAltura());
            periodicoDTO.setComprimento(periodico.getComprimento());
            periodicoDTO.setUni_medida_dim(periodico.getUni_medida_dim());
            periodicoDTO.setQtd_amarrado(periodico.getQtd_amarrado());
            periodicoDTO.setQtd_total(periodico.getQtd_total());
            periodicoDTO.setQtd_extra(periodico.getQtd_extra());
            periodicoDTO.setLegenda(periodico.getLegenda());
            detalheDTO.setPeriodico(periodicoDTO);
        }
        return detalheDTO;
    }
}
