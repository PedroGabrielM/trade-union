package br.com.gameoverproject.tradeunion.vacancy.service.impl;

import br.com.gameoverproject.tradeunion.vacancy.domain.Vacancy;
import br.com.gameoverproject.tradeunion.vacancy.repository.VacancyRepository;
import br.com.gameoverproject.tradeunion.vacancy.service.VacancyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VacancyServiceImpl implements VacancyService {

    private VacancyRepository vacancyRepository;

    public VacancyServiceImpl(VacancyRepository vacancyRepository) {
        this.vacancyRepository = vacancyRepository;
    }

    @Override
    public Vacancy save(Vacancy vacancy) {
        return vacancyRepository.save(vacancy);
    }

    @Override
    public List<Vacancy> findAll() {
        return vacancyRepository.findAll();
    }

    @Override
    public Optional<Vacancy> findById(Long id) {
        return vacancyRepository.findById(id);
    }

    @Override
    public Vacancy update(Vacancy vacancy) {
        return vacancyRepository.save(vacancy);
    }

    @Override
    public void deleteById(Long id) {
        vacancyRepository.deleteById(id);
    }
}
