package br.com.gameoverproject.tradeunion.vacancy.repository;

import br.com.gameoverproject.tradeunion.vacancy.domain.Vacancy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacancyRepository extends JpaRepository<Vacancy, Long> {
}
