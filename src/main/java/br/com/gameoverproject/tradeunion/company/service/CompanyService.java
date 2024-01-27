package br.com.gameoverproject.tradeunion.company.service;

import br.com.gameoverproject.tradeunion.company.domain.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyService {

    Company save(Company company);
    List<Company> findAll();
    Optional<Company> findById(Long id);
    Company update(Company company);
    void deleteById(Long id);
}
