package br.com.gameoverproject.tradeunion.document.service;

import br.com.gameoverproject.tradeunion.document.domain.Document;

import java.util.List;
import java.util.Optional;

public interface DocumentService {

    Document save(Document document);
    List<Document> findAll();
    Optional<Document> findById(Long id);
    Document update(Document document);
    void deleteById(Long id);
}
