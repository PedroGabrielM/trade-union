package br.com.gameoverproject.tradeunion.administrator.service;

import br.com.gameoverproject.tradeunion.administrator.domain.Administrator;

import java.util.List;
import java.util.Optional;

public interface AdministratorService {

    Administrator save(Administrator administrator);
    List<Administrator> findAll();
    Optional<Administrator> findById(Long id);
    Administrator update(Administrator administrator);
    void deleteById(Long ig);
}
