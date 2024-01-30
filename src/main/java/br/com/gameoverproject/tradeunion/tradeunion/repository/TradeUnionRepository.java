package br.com.gameoverproject.tradeunion.tradeunion.repository;

import br.com.gameoverproject.tradeunion.tradeunion.domain.TradeUnion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradeUnionRepository extends JpaRepository<TradeUnion, Long> {
}