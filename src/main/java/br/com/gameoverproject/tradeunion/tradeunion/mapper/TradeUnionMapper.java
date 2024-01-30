package br.com.gameoverproject.tradeunion.tradeunion.mapper;

import br.com.gameoverproject.tradeunion.tradeunion.domain.TradeUnion;
import br.com.gameoverproject.tradeunion.tradeunion.dto.TradeUnionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface TradeUnionMapper {
    TradeUnionDTO tradeUnionToTradeUnionDTO(TradeUnion tradeUnion);
    TradeUnion TradeUnionDTOToTradeUnion(TradeUnionDTO tradeUnionDTO);
}
