package br.com.ordepsomar.eremessa.service.impl;

import br.com.ordepsomar.eremessa.controller.dto.CreatePeriodicoDto;
import br.com.ordepsomar.eremessa.controller.dto.UpdatePeriodicoDto;
import br.com.ordepsomar.eremessa.entity.Periodico;
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

    @Override
    public Periodico createPeriodico(CreatePeriodicoDto createPeriodicoDto) {

        var entity = new Periodico();
             entity.setTp_registro(createPeriodicoDto.tp_registro());
             entity.setCod_titulo(createPeriodicoDto.cod_titulo());
             entity.setId_periodico(createPeriodicoDto.id_periodico());
             entity.setNum_edicao(createPeriodicoDto.num_edicao());
             entity.setTp_periodico(createPeriodicoDto.tp_periodico());
             entity.setPeso_un(createPeriodicoDto.peso_un());
             entity.setUni_medida_un(createPeriodicoDto.uni_medida_un());
             entity.setLargura(createPeriodicoDto.largura());
             entity.setAltura(createPeriodicoDto.altura());
             entity.setComprimento(createPeriodicoDto.comprimento());
             entity.setUni_medida_dim(createPeriodicoDto.uni_medida_dim());
             entity.setQtd_amarrado(createPeriodicoDto.qtd_amarrado());
             entity.setQtd_total(createPeriodicoDto.qtd_total());
             entity.setQtd_extra(createPeriodicoDto.qtd_extra());
             entity.setLegenda(createPeriodicoDto.legenda());



        return periodicoRepository.save(entity);
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
}
