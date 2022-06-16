package com.persistencia.MVC.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Hospede {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name ="id_Hospede") 
    private int id;
    @Column(nullable = false, length = 255)
    private String nome;
    @Column(nullable = false, length = 11)
    private String cpf;
    @Column(nullable = false, length = 11)
    private String telefone;
    @Column(nullable = false, length = 255)
    private String email;
    @Column(nullable = false, length = 255)
    private String senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
