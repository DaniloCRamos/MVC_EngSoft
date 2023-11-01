package br.edu.fatecl.mvcdemo.controllers;

import br.edu.fatecl.mvcdemo.models.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/aluno")
public class DadosController {

    private static final List<Aluno> alunos = new ArrayList<Aluno>();

    public DadosController() {
        alunos.add(new Aluno("A","Engenharia",7.0,8.0));
        alunos.add(new Aluno("B","SO",9.0,8.0));
        alunos.add(new Aluno("C","POO",6.0,10.0));
    }

    @GetMapping
    public List<Aluno> getAlunos(){
        return alunos;
    }
}
