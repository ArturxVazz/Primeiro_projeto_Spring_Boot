package br.senac.tads.dsw.exemplo_spring_boot;

import br.senac.tads.dsw.exemplo_spring_boot.Dados;
import br.senac.tads.dsw.exemplo_spring_boot.GeradorDeSaida;
import br.senac.tads.dsw.exemplo_spring_boot.GeradorDeSaidaJson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ExemploController {
    private final GeradorDeSaida geradorDeSaida;

    public ExemploController(GeradorDeSaida geradorDeSaida) {
        this.geradorDeSaida = geradorDeSaida;
    }

    @GetMapping("/gerarJson")
    public String gerarJson(
            @RequestParam("nome") String nome,
            @RequestParam ("email") String email,
            @RequestParam ("time") String time)
    {
        Dados dados = new Dados(nome, email, LocalDateTime.now(), time);
        return geradorDeSaida.gerarSaida(dados);

    }


    }






