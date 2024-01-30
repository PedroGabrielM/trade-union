package br.com.gameoverproject.tradeunion.departament.mapper;

import br.com.gameoverproject.tradeunion.departament.domain.Departament;
import br.com.gameoverproject.tradeunion.departament.dto.DepartamentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DepartamentMapper {
    DepartamentDTO departamentDTOToDepartament(Departament departament);
    Departament departamentToDepartamentDTO(DepartamentDTO departamentDTO);
}
