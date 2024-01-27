package br.com.gameoverproject.tradeunion.vacancy.controller;

import br.com.gameoverproject.tradeunion.vacancy.domain.Vacancy;
import br.com.gameoverproject.tradeunion.vacancy.service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/vacancy")
public class VacancyController {

    @Autowired
    private VacancyService vacancyService;

    @GetMapping("/documents")
    public ResponseEntity<List<Vacancy>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(vacancyService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Vacancy>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(vacancyService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Vacancy> create(@RequestBody Vacancy vacancy){
        return ResponseEntity.status(HttpStatus.CREATED).body(vacancyService.save(vacancy));
    }

    @PutMapping
    public ResponseEntity<Vacancy> update(@RequestBody Vacancy vacancy){
        return ResponseEntity.status(HttpStatus.OK).body(vacancyService.update(vacancy));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        vacancyService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
