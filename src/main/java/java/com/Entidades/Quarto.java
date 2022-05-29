package java.com.Entidades;

public class Quarto {

    private int id;
    private String nome; // Nome do quarto. Ex.: Suíte Master, Suíte Padrão, Quarto Família...
    private int capacidadeAdultos;
    private int capacidadeCriancas;
    private float valor;

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCapacidadeAdultos(int capacidadeAdultos) {
        this.capacidadeAdultos = capacidadeAdultos;
    }

    public void setCapacidadeCriancas(int capacidadeCriancas) {
        this.capacidadeCriancas = capacidadeCriancas;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidadeAdultos() {
        return capacidadeAdultos;
    }

    public int getCapacidadeCriancas() {
        return capacidadeCriancas;
    }

    public float getValor() {
        return valor;
    }
}
