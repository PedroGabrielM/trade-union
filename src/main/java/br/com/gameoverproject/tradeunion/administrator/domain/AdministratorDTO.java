package br.com.gameoverproject.tradeunion.administrator.domain;

public record AdministratorDTO(
        String cpf,
        String name,
        String email,
        String phone,
        AdministratorType administratorType
) {
}
