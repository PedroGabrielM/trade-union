package br.com.gameoverproject.tradeunion.administrator.mapper;

import br.com.gameoverproject.tradeunion.administrator.domain.Administrator;
import br.com.gameoverproject.tradeunion.administrator.dto.AdministratorDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AdministratorMapper {
    AdministratorDTO administratorToAdministratorDTO(Administrator administrator);
    Administrator administratorDTOToAdministrator(AdministratorDTO administratorDTO);
}
