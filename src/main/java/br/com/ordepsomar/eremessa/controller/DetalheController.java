package br.com.ordepsomar.eremessa.controller;

import br.com.ordepsomar.eremessa.controller.dto.CreateDetalheDto;
import br.com.ordepsomar.eremessa.controller.dto.DetalheDTO;
import br.com.ordepsomar.eremessa.entity.Detalhe;
import br.com.ordepsomar.eremessa.service.DetalheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/detalhes")
public class DetalheController {

    @Autowired
    private DetalheService detalheService;

    public DetalheController(DetalheService detalheService) {
        this.detalheService = detalheService;
    }

    @PostMapping
    public ResponseEntity<DetalheDTO> saveDetalhe(@RequestBody DetalheDTO detalheDTO){
        DetalheDTO savedDetalhe = detalheService.saveDetalhe(detalheDTO);
        return ResponseEntity.ok(savedDetalhe);
    }
}
