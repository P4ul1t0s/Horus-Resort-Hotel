package java.com.Entidades;

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

    @Column(nullable = false, length = 255) 
    private String endereco;

    @Column(nullable = false, length = 255, unique = true) 
    private String telefone;

    @Column(nullable = false, length = 255, unique = true) 
    private String email;

    @Column(nullable = false, length = 255) 
    private String senha;

    @NonNull
    private boolean admin;

    
    
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
    
    public String getEndereco() {
        return endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
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