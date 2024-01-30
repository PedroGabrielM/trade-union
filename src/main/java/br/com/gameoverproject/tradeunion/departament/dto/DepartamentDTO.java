package br.com.gameoverproject.tradeunion.departament.dto;

import br.com.gameoverproject.tradeunion.departament.domain.DepartamentType;

public record DepartamentDTO(
        Long id,
        String name,
        DepartamentType type
) {
}
