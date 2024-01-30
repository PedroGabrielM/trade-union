package br.com.gameoverproject.tradeunion.client.mapper;

import br.com.gameoverproject.tradeunion.client.domain.Client;
import br.com.gameoverproject.tradeunion.client.dto.ClienteDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ClientMapper {

    ClienteDTO clientToClientDTO(Client client);
    Client clientDTOToClient(ClienteDTO clienteDTO);
}
