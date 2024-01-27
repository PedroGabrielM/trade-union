package br.com.gameoverproject.tradeunion.departament.repository;

import br.com.gameoverproject.tradeunion.departament.domain.Departament;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentRepository extends JpaRepository<Departament, Long> {
}
