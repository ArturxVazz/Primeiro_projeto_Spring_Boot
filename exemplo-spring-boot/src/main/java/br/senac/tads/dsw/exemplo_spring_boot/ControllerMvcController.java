package br.senac.tads.dsw.exemplo_spring_boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;

@Controller
public class ControllerMvcController {
    private final GeradorDeSaida geradorDeSaida;

    public ControllerMvcController(GeradorDeSaida geradorDeSaida) {
        this.geradorDeSaida = geradorDeSaida;
    }

    @GetMapping("/mvc")
    public String gerarDados (@RequestParam("nome") String nome,
                              @RequestParam("email") String email,
                              @RequestParam("time") String time,
                              Model model){
        Dados dados = new Dados(nome,email, LocalDateTime.now(), time);
        model.addAttribute("dados", dados);

        return "tela-template";

    }
}
