package br.com.gameoverproject.tradeunion.departament.controller;

import br.com.gameoverproject.tradeunion.departament.domain.Departament;
import br.com.gameoverproject.tradeunion.departament.service.DepartamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/departament")
public class DepartamentController {

    @Autowired
    private DepartamentService departamentService;

    @GetMapping("/departaments")
    public ResponseEntity<List<Departament>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(departamentService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Departament>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(departamentService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Departament> create(@RequestBody Departament departament){
        return ResponseEntity.status(HttpStatus.CREATED).body(departamentService.save(departament));
    }

    @PutMapping
    public ResponseEntity<Departament> update(@RequestBody Departament departament){
        return ResponseEntity.status(HttpStatus.OK).body(departamentService.update(departament));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        departamentService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
