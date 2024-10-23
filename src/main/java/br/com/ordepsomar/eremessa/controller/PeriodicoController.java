package br.com.ordepsomar.eremessa.controller;

import br.com.ordepsomar.eremessa.controller.dto.CreatePeriodicoDto;
import br.com.ordepsomar.eremessa.controller.dto.UpdatePeriodicoDto;
import br.com.ordepsomar.eremessa.entity.Periodico;
import br.com.ordepsomar.eremessa.service.PeriodicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/periodicos")
public class PeriodicoController {

    @Autowired
    private PeriodicoService periodicoService;

    @GetMapping
    public List<Periodico> listPeriodicos(){
       return periodicoService.listPeriodicos();
    }

    @PostMapping
    public Periodico savePeriodico(@RequestBody CreatePeriodicoDto createPeriodicoDto){
        return periodicoService.createPeriodico(createPeriodicoDto);
    }

    @PutMapping("/{id}")
    public Periodico updatePeriodico(@PathVariable("id") Long id, @RequestBody UpdatePeriodicoDto updatePeriodicoDto){

       return periodicoService.updateById(id, updatePeriodicoDto);
    }

    @DeleteMapping("/{id}")
    public String deletePeriodico(@PathVariable("id") Long id){
        return periodicoService.deleteById(id);
    }
}
