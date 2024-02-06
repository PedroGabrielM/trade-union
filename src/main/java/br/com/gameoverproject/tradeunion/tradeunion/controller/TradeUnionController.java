package br.com.gameoverproject.tradeunion.tradeunion.controller;

import br.com.gameoverproject.tradeunion.tradeunion.domain.TradeUnion;
import br.com.gameoverproject.tradeunion.tradeunion.service.TradeUnionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/trade-union")
public class TradeUnionController {

    private TradeUnionService service;

    public TradeUnionController(TradeUnionService service) {
        this.service = service;
    }

    @GetMapping("/companys")
    public ResponseEntity<List<TradeUnion>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<TradeUnion>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<TradeUnion> create(@RequestBody TradeUnion tradeUnion){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(tradeUnion));
    }

    @PutMapping
    public ResponseEntity<TradeUnion> update(@RequestBody TradeUnion tradeUnion){
        return ResponseEntity.status(HttpStatus.OK).body(service.update(tradeUnion));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
