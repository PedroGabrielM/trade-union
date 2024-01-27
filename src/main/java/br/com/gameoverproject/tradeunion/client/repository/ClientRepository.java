package br.com.gameoverproject.tradeunion.client.repository;

import br.com.gameoverproject.tradeunion.client.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}
