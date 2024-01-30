package br.com.gameoverproject.tradeunion.tradeunion.service;

import br.com.gameoverproject.tradeunion.client.domain.Client;
import br.com.gameoverproject.tradeunion.tradeunion.domain.TradeUnion;

import java.util.List;
import java.util.Optional;

public interface TradeUnionService {

    TradeUnion save(TradeUnion tradeUnion);
    List<TradeUnion> findAll();
    Optional<TradeUnion> findById(Long id);
    TradeUnion update(TradeUnion tradeUnion);
    void deleteById(Long id);
}