package br.com.gameoverproject.tradeunion.departament.service.impl;

import br.com.gameoverproject.tradeunion.departament.domain.Departament;
import br.com.gameoverproject.tradeunion.departament.repository.DepartamentRepository;
import br.com.gameoverproject.tradeunion.departament.service.DepartamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentServiceImpl implements DepartamentService {

    private DepartamentRepository departamentRepository;

    public DepartamentServiceImpl(DepartamentRepository departamentRepository) {
        this.departamentRepository = departamentRepository;
    }

    @Override
    public Departament save(Departament departament) {
        return departamentRepository.save(departament);
    }

    @Override
    public List<Departament> findAll() {
        return departamentRepository.findAll();
    }

    @Override
    public Optional<Departament> findById(Long id) {
        return departamentRepository.findById(id);
    }

    @Override
    public Departament update(Departament departament) {
        return departamentRepository.save(departament);
    }

    @Override
    public void deleteById(Long id) {
        departamentRepository.deleteById(id);
    }
}
