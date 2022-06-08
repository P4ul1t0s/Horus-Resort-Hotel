package java.com.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity //diz que é uma entidade
@Table(name = "funcionario") //definindo o nome da tabela no banco de dados (somente caso eu queira que o nome da tabela seja diferente do nome da classe)
public class Funcionario {

    private String nome;
    private String email;
    private String senha;
    private String funcao;
    private int id;

    @Id //diz que é chave primario no banco
    @GeneratedValue(strategy = GenerationType.IDENTITY) //defindindo id como auto increment
    @Column(name ="idPessoa") //define o nome da coluna na tabela funcionario
    public int getId() {
        return id;
    }
    
    @Column(nullable = false, length = 255) // define que a coluna não pode ser nula e máximo de 255 caracteres
    public String getNome() {
        return nome;
    }
    
    @Column(nullable = false, length = 255) 
    public String getEmail() {
        return email;
    }

    @Column(nullable = false, length = 255)
    public String getSenha() {
        return senha;
    }
    
    @Column(nullable = false, length = 20)
    public String getFuncao() {
        return funcao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}