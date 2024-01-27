package br.com.gameoverproject.tradeunion.company.dto;

public record CompanyDTO(
        Long id,
        String cnpj,
        String name,
        String email,
        String phone
) {}