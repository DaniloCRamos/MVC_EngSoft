package br.edu.fatecl.mvcdemo.controllers;

import br.edu.fatecl.mvcdemo.models.Aluno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/aluno")
public class AlunosController {

    private static final List<Aluno> alunos = new ArrayList<Aluno>();

    public AlunosController() {
        alunos.add(new Aluno("Alberto","Engenharia",7.0,8.0));
        alunos.add(new Aluno("Bernardo","SO",9.0,8.0));
        alunos.add(new Aluno("Carlos","POO",6.0,10.0));
    }

    @GetMapping
    public String getAlunos(Model model){
        model.addAttribute("alunos", alunos);
        return "alunos";
    }


}
