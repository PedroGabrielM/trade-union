package br.com.gameoverproject.tradeunion.company.controller;

import br.com.gameoverproject.tradeunion.company.domain.Company;
import br.com.gameoverproject.tradeunion.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/company")
public class CompanyController {

    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/companys")
    public ResponseEntity<List<Company>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Company>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Company> create(@RequestBody Company company){
        return ResponseEntity.status(HttpStatus.CREATED).body(companyService.save(company));
    }

    @PutMapping
    public ResponseEntity<Company> update(@RequestBody Company company){
        return ResponseEntity.status(HttpStatus.OK).body(companyService.update(company));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        companyService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
