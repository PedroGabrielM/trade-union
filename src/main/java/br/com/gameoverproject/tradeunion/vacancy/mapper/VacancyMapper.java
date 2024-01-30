package br.com.gameoverproject.tradeunion.vacancy.mapper;

import br.com.gameoverproject.tradeunion.vacancy.domain.Vacancy;
import br.com.gameoverproject.tradeunion.vacancy.dto.VacancyDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VacancyMapper {
    VacancyDTO vacancyToVacancyDTO(Vacancy vacancy);
    Vacancy vacancyDTOToVacancy(VacancyDTO vacancyDTO);
}
