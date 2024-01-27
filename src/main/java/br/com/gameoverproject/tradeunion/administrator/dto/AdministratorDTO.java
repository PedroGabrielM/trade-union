package br.com.gameoverproject.tradeunion.administrator.dto;

import br.com.gameoverproject.tradeunion.administrator.domain.AdministratorType;

public record AdministratorDTO(
        Long id,
        String cpf,
        String name,
        String email,
        String phone,
        AdministratorType administratorType
) {}
