package br.com.gameoverproject.tradeunion.document.controller;

import br.com.gameoverproject.tradeunion.document.domain.Document;
import br.com.gameoverproject.tradeunion.document.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/document")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @GetMapping("/documents")
    public ResponseEntity<List<Document>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(documentService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Document>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(documentService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Document> create(@RequestBody Document document){
        return ResponseEntity.status(HttpStatus.CREATED).body(documentService.save(document));
    }

    @PutMapping
    public ResponseEntity<Document> update(@RequestBody Document document){
        return ResponseEntity.status(HttpStatus.OK).body(documentService.update(document));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        documentService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
