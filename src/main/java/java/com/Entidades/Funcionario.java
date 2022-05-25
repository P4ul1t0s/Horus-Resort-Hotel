package java.com.Entidades;

public class Funcionario {

    private String nome;
    private String email;
    private String senha;
    private String funcao;

    public String getNome() {
        return nome;
    } 

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getFuncao() {
        return funcao;
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