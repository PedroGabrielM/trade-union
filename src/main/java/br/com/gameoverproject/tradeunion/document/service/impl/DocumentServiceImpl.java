package br.com.gameoverproject.tradeunion.document.service.impl;

import br.com.gameoverproject.tradeunion.document.domain.Document;
import br.com.gameoverproject.tradeunion.document.repository.DocumentRepository;
import br.com.gameoverproject.tradeunion.document.service.DocumentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentServiceImpl implements DocumentService {

    private DocumentRepository documentRepository;

    public DocumentServiceImpl(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Override
    public Document save(Document document) {
        return documentRepository.save(document);
    }

    @Override
    public List<Document> findAll() {
        return documentRepository.findAll();
    }

    @Override
    public Optional<Document> findById(Long id) {
        return documentRepository.findById(id);
    }

    @Override
    public Document update(Document document) {
        return documentRepository.save(document);
    }

    @Override
    public void deleteById(Long id) {
        documentRepository.deleteById(id);
    }
}
