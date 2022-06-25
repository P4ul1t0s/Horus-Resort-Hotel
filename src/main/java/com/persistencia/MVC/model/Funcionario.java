package com.persistencia.MVC.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;


@Entity //diz que é uma entidade
@Table(name = "funcionario") //definindo o nome da tabela no banco de dados (somente caso eu queira que o nome da tabela seja diferente do nome da classe)
public class Funcionario {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name ="id_Pessoa") 
    private int id;

    @Column(nullable = false, length = 255)
    private String nome;

    @Column(nullable = false, unique = true) 
    private String cpf;

    @Column(nullable = false, length = 255, unique = true) 
    private String telefone;

    @Column(nullable = false, length = 255, unique = true) 
    private String email;

    @Column(nullable = false, length = 255) 
    private String senha; //user vai ser cpf

    @NonNull
    private boolean admin;

    @Column(nullable = false, length = 8) 
    private String cep;

    @Column(nullable = false, length = 255) 
    private String cidade;

    @Column(nullable = false, length = 255) 
    private String bairro;

    @Column(nullable = false, length = 255) 
    private String rua;
    
    @Column(nullable = false, length = 255) 
    private String numero;
    
    


    
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

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

    public boolean isAdmin() {
        return admin;
    }
    
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }


}