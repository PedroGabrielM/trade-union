package br.com.gameoverproject.tradeunion.vacancy.service;

import br.com.gameoverproject.tradeunion.document.domain.Document;
import br.com.gameoverproject.tradeunion.vacancy.domain.Vacancy;

import java.util.List;
import java.util.Optional;

public interface VacancyService {

    Vacancy save(Vacancy vacancy);
    List<Vacancy> findAll();
    Optional<Vacancy> findById(Long id);
    Vacancy update(Vacancy vacancy);
    void deleteById(Long id);
}
