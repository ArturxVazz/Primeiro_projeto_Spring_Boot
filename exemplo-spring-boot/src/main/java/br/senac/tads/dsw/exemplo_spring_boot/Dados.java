package br.senac.tads.dsw.exemplo_spring_boot;

import java.time.LocalDateTime;

public record Dados(String nome, String email, LocalDateTime dataHoraAtual, String time) {
}
