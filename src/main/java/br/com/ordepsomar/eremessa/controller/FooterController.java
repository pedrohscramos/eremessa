package br.com.ordepsomar.eremessa.controller;


import br.com.ordepsomar.eremessa.controller.dto.DetalheDTO;
import br.com.ordepsomar.eremessa.controller.dto.FooterDTO;
import br.com.ordepsomar.eremessa.service.FooterService;
import br.com.ordepsomar.eremessa.service.PeriodicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/footer")
public class FooterController {

    @Autowired
    private FooterService footerService;


    @PostMapping
    public ResponseEntity<FooterDTO> saveFooter(@RequestBody FooterDTO footerDTO){
        FooterDTO savedFooter = footerService.saveFooter(footerDTO);
        return ResponseEntity.ok(savedFooter);
    }

}
