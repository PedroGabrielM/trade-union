package br.com.gameoverproject.tradeunion.administrator.repository;

import br.com.gameoverproject.tradeunion.administrator.domain.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
}
