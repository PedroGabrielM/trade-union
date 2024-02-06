package br.com.gameoverproject.tradeunion.tradeunion.service.impl;

import br.com.gameoverproject.tradeunion.tradeunion.domain.TradeUnion;
import br.com.gameoverproject.tradeunion.tradeunion.repository.TradeUnionRepository;
import br.com.gameoverproject.tradeunion.tradeunion.service.TradeUnionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TradeUnionServiceImpl implements TradeUnionService {

    private TradeUnionRepository repository;

    public TradeUnionServiceImpl(TradeUnionRepository repository) {
        this.repository = repository;
    }

    @Override
    public TradeUnion save(TradeUnion tradeUnion) {
        return repository.save(tradeUnion);
    }

    @Override
    public List<TradeUnion> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<TradeUnion> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public TradeUnion update(TradeUnion tradeUnion) {
        return repository.save(tradeUnion);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
