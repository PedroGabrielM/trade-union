package br.com.gameoverproject.tradeunion.company.repository;

import br.com.gameoverproject.tradeunion.company.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
}