package br.com.gameoverproject.tradeunion.departament.service;

import br.com.gameoverproject.tradeunion.departament.domain.Departament;

import java.util.List;
import java.util.Optional;

public interface DepartamentService {

    Departament save(Departament departament);
    List<Departament> findAll();
    Optional<Departament> findById(Long id);
    Departament update(Departament departament);
    void deleteById(Long id);
}
