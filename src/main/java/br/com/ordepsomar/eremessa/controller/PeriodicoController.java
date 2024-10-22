package br.com.ordepsomar.eremessa.controller;

import br.com.ordepsomar.eremessa.controller.dto.CreatePeriodicoDto;
import br.com.ordepsomar.eremessa.controller.dto.UpdatePeriodicoDto;
import br.com.ordepsomar.eremessa.entity.Periodico;
import br.com.ordepsomar.eremessa.repository.PeriodicoRepository;
import br.com.ordepsomar.eremessa.service.PeriodicoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/v1/periodicos")
public class PeriodicoController {

    private PeriodicoService periodicoService;

    public PeriodicoController(PeriodicoService periodicoService) {
        this.periodicoService = periodicoService;
    }

    @GetMapping
    public ResponseEntity<List<Periodico>> listPeriodicos(){
        var periodicos = periodicoService.listPeriodicos();

        return ResponseEntity.ok(periodicos);
    }

    @PostMapping
    public ResponseEntity<Periodico> create(@RequestBody CreatePeriodicoDto createPeriodicoDto){
        var periodicoId = periodicoService.createPeriodico(createPeriodicoDto);

        return ResponseEntity.created(URI.create("/v1/periodicos/" + periodicoId.toString())).build();
    }

    @PutMapping(value = "/{periodicoId}")
    public ResponseEntity<Void> updatePeriodicoById(@PathVariable("periodicoId") String periodicoId, @RequestBody UpdatePeriodicoDto updatePeriodicoDto){

        periodicoService.updatePeriodicoById(periodicoId, updatePeriodicoDto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(path = {"/{periodicoId}"})
    public ResponseEntity<Void> deleteById(@PathVariable("periodicoId") String periodicoId){
        periodicoService.deleteById(periodicoId);
        return ResponseEntity.noContent().build();
    }
}
