package br.edu.fatecl.mvcdemo.controllers;

import br.edu.fatecl.mvcdemo.models.Jogo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/jogos")
public class JogosController {
    private static final List<Jogo> jogos = new ArrayList<Jogo>();

    public JogosController() {
        jogos.add(new Jogo("Sea of Thieves","2018"));
        jogos.add(new Jogo("Borderlands 3","2019"));
        jogos.add(new Jogo("Baldur's Gate 3","2023"));
    }

    @GetMapping
    public String getJogos(Model model){
        model.addAttribute("jogos", jogos);
        return "jogos";
    }
}
