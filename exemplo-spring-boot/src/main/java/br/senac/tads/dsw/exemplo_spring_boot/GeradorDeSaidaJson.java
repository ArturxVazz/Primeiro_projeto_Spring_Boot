package br.senac.tads.dsw.exemplo_spring_boot;

import java.time.format.DateTimeFormatter;

public class GeradorDeSaidaJson implements GeradorDeSaida {
    @Override
    public String gerarSaida(Dados dados) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        return """
      {
        "nome": "%s",
        "email": "%s",
        "dataHoraAtual": "%s"
      }
      """.formatted(dados.nome(), dados.email(), formatter.format(dados.dataHoraAtual()));
    }

}
