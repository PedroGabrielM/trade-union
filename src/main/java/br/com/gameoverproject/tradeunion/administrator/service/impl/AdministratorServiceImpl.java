package br.com.gameoverproject.tradeunion.administrator.service.impl;

import br.com.gameoverproject.tradeunion.administrator.domain.Administrator;
import br.com.gameoverproject.tradeunion.administrator.repository.AdministratorRepository;
import br.com.gameoverproject.tradeunion.administrator.service.AdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    private AdministratorRepository administratorRepository;

    public AdministratorServiceImpl(AdministratorRepository administratorRepository) {
        this.administratorRepository = administratorRepository;
    }

    @Override
    public Administrator save(Administrator administrator) {
        return administratorRepository.save(administrator);
    }

    @Override
    public List<Administrator> findAll() {
        return administratorRepository.findAll();
    }

    @Override
    public Optional<Administrator> findById(Long id) {
        return administratorRepository.findById(id);
    }

    @Override
    public Administrator update(Administrator administrator) {
        return administratorRepository.save(administrator);
    }

    @Override
    public void deleteById(Long id) {
        administratorRepository.deleteById(id);
    }
}
