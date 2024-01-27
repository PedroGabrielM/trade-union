package br.com.gameoverproject.tradeunion.client.service;

import br.com.gameoverproject.tradeunion.client.domain.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    Client save(Client client);
    List<Client> findAll();
    Optional<Client> findById(Long id);
    Client update(Client client);
    void deleteById(Long id);
}
