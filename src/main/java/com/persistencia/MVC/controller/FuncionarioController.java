package com.persistencia.MVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import com.persistencia.MVC.model.Funcionario;
import com.persistencia.MVC.repository.FuncionarioRepository;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {
    
    @Autowired
    private FuncionarioRepository FuncionarioRepository;

    @PostMapping
    public String adicionar(Funcionario funcionario) {
        FuncionarioRepository.save(funcionario);
        return "redirect:/back/funcionarios";
    }

    @GetMapping
    public List<Funcionario> listar() {
        return FuncionarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Funcionario buscarPorId(@PathVariable Integer id) {
        final Optional<Funcionario> funcionarioOpcional = FuncionarioRepository.findById(id);
        return funcionarioOpcional.get();
    }
}
