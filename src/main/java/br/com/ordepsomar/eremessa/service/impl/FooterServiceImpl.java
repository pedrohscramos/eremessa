package br.com.ordepsomar.eremessa.service.impl;

import br.com.ordepsomar.eremessa.controller.dto.*;
import br.com.ordepsomar.eremessa.entity.Detalhe;
import br.com.ordepsomar.eremessa.entity.Footer;
import br.com.ordepsomar.eremessa.entity.Periodico;
import br.com.ordepsomar.eremessa.repository.DetalheRepository;
import br.com.ordepsomar.eremessa.repository.FooterRepository;
import br.com.ordepsomar.eremessa.repository.PeriodicoRepository;
import br.com.ordepsomar.eremessa.service.FooterService;
import br.com.ordepsomar.eremessa.service.PeriodicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FooterServiceImpl implements FooterService {

    @Autowired
    private FooterRepository footerRepository;

    @Override
    public FooterDTO saveFooter(FooterDTO footerDTO) {

        Footer footer = convertToEntity(footerDTO);
        Footer savedFooter = footerRepository.save(footer);
        return convertToDTO(savedFooter);

    }


    private Footer convertToEntity(FooterDTO footerDTO){
        Footer footer = new Footer();
        footer.setId(footerDTO.getId());
        footer.setTp_registro(footerDTO.getTp_registro());
        footer.setQtd_total(footerDTO.getQtd_total());
        footer.setPeso_total(footerDTO.getPeso_total());
        footer.setUni_medida(footerDTO.getUni_medida());


        return footer;
    }

    private FooterDTO convertToDTO(Footer footer){
        FooterDTO footerDTO = new FooterDTO();
        footerDTO.setId(footer.getId());
        footerDTO.setTp_registro(footer.getTp_registro());
        footerDTO.setQtd_total(footer.getQtd_total());
        footerDTO.setPeso_total(footer.getPeso_total());
        footerDTO.setUni_medida(footer.getUni_medida());
        footerDTO.setPeriodico_id(footer.getPeriodico_id());


        return footerDTO;
    }
}
