package br.com.gameoverproject.tradeunion.client.dto;

public record ClienteDTO(
        Long id,
        String cpf,
        String name,
        String email,
        String phone,
        String address
) {}
