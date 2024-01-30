package br.com.gameoverproject.tradeunion.document.mapper;

import br.com.gameoverproject.tradeunion.document.domain.Document;
import br.com.gameoverproject.tradeunion.document.dto.DocumentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface DocumentMapper {
    DocumentDTO documentToDocumentDTO(Document document);
    Document documentDTOToDocument(DocumentDTO documentDTO);
}
