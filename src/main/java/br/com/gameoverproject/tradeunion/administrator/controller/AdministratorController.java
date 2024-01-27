package br.com.gameoverproject.tradeunion.administrator.controller;

import br.com.gameoverproject.tradeunion.administrator.domain.Administrator;
import br.com.gameoverproject.tradeunion.administrator.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/administrator")
public class AdministratorController {

    @Autowired
    private AdministratorService administratorService;

    @GetMapping("/administrators")
    public ResponseEntity<List<Administrator>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(administratorService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Administrator>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(administratorService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Administrator> create(@RequestBody Administrator administrator){
        return ResponseEntity.status(HttpStatus.CREATED).body(administratorService.save(administrator));
    }

    @PutMapping
    public ResponseEntity<Administrator> update(@RequestBody Administrator administrator){
        return ResponseEntity.status(HttpStatus.OK).body(administratorService.update(administrator));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        administratorService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
