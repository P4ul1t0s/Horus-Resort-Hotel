package java.com.Entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.lang.NonNull;

public class Reserva {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name ="id_Reserva") 
    private int id;

    @NonNull
    private Quarto quarto;

    @NonNull
    private Hospede titular;

    private List <Hospede> acompanhantes;

    @NonNull
    private Date checkin;

    @NonNull
    private Date checkout;


    @OneToMany(mappedBy = "acompanhantes", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    public List<Hospede> getAcompanhantes() {
        return acompanhantes;
    }

    public void setAcompanhantes(List<Hospede> acompanhantes) {
        this.acompanhantes = acompanhantes;
    }

    public Hospede getTitular() {
        return titular;
    }

    public void setTitular(Hospede titular) {
        this.titular = titular;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    
}
