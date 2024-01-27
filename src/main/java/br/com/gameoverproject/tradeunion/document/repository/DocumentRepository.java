package br.com.gameoverproject.tradeunion.document.repository;

import br.com.gameoverproject.tradeunion.document.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
}
