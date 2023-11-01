package br.edu.fatecl.mvcdemo.controllers;

import br.edu.fatecl.mvcdemo.models.Aluno;
import br.edu.fatecl.mvcdemo.models.Jogo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/jogos")
public class JogosDadosController {

    private static final List<Jogo> jogos = new ArrayList<Jogo>();

    public JogosDadosController() {
        jogos.add(new Jogo("Sea of Thieves","2018"));
        jogos.add(new Jogo("Borderlands 3","2019"));
        jogos.add(new Jogo("Baldur's Gate 3","2023"));
    }

    @GetMapping
    public List<Jogo> getJogos(){
        return jogos;
    }
}

