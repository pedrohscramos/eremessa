package br.com.ordepsomar.eremessa.service;

import br.com.ordepsomar.eremessa.controller.dto.CreatePeriodicoDto;
import br.com.ordepsomar.eremessa.controller.dto.UpdatePeriodicoDto;
import br.com.ordepsomar.eremessa.entity.Periodico;
import br.com.ordepsomar.eremessa.repository.PeriodicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PeriodicoService {
    private PeriodicoRepository periodicoRepository;

    public PeriodicoService(PeriodicoRepository periodicoRepository) {
        this.periodicoRepository = periodicoRepository;
    }

    public UUID createPeriodico(CreatePeriodicoDto createPeriodicoDto) {

        var entity = new Periodico(
                UUID.randomUUID(),
                createPeriodicoDto.tp_registro(),
                createPeriodicoDto.cod_titulo(),
                createPeriodicoDto.id_periodico(),
                createPeriodicoDto.num_edicao(),
                createPeriodicoDto.tp_periodico(),
                createPeriodicoDto.peso_un(),
                createPeriodicoDto.uni_medida_un(),
                createPeriodicoDto.largura(),
                createPeriodicoDto.altura(),
                createPeriodicoDto.comprimento(),
                createPeriodicoDto.uni_medida_un(),
                createPeriodicoDto.qtd_amarrado(),
                createPeriodicoDto.qtd_total(),
                createPeriodicoDto.qtd_extra(),
                null);

        var periodicoSaved = periodicoRepository.save(entity);
        return periodicoSaved.getPeriodicoId();
    }

    public List<Periodico> listPeriodicos(){
        return periodicoRepository.findAll();
    }

    public void deleteById(String periodicoId){

        var id = UUID.fromString(periodicoId);

        var periodicoExists = periodicoRepository.existsById(id);

        if(periodicoExists){
            periodicoRepository.deleteById(id);
        }
    }

    public void updatePeriodicoById(String periodicoId, UpdatePeriodicoDto updatePeriodicoDto){

        var id = UUID.fromString(periodicoId);

        var periodicoEntity = periodicoRepository.findById(id);

        if(periodicoEntity.isPresent()){
            var periodico = periodicoEntity.get();

            if(updatePeriodicoDto.num_edicao() != null){
                periodico.setNum_edicao(updatePeriodicoDto.num_edicao());
            }

            if(updatePeriodicoDto.qtd_total() != null){
                periodico.setQtd_total(updatePeriodicoDto.qtd_total());
            }

            periodicoRepository.save(periodico);
        }
    }
}
