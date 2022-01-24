import java.util.*;

public class Immobile {
    private int numeroStanze;
    private int superficie;
    private String indirizzo;
    private String città;


    public Immobile() {
    }

    public Immobile(int numeroStanze, int superficie, String indirizzo, String città) {
        this.numeroStanze = numeroStanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.città = città;
    }

    public int getNumeroStanze() {
        return this.numeroStanze;
    }

    public void setNumeroStanze(int numeroStanze) {
        this.numeroStanze = numeroStanze;
    }

    public int getSuperficie() {
        return this.superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public String getIndirizzo() {
        return this.indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCittà() {
        return this.città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public Immobile numeroStanze(int numeroStanze) {
        setNumeroStanze(numeroStanze);
        return this;
    }

    public Immobile superficie(int superficie) {
        setSuperficie(superficie);
        return this;
    }

    public Immobile indirizzo(String indirizzo) {
        setIndirizzo(indirizzo);
        return this;
    }

    public Immobile città(String città) {
        setCittà(città);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Immobile)) {
            return false;
        }
        Immobile immobile = (Immobile) o;
        return numeroStanze == immobile.numeroStanze && superficie == immobile.superficie && Objects.equals(indirizzo, immobile.indirizzo) && Objects.equals(città, immobile.città);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroStanze, superficie, indirizzo, città);
    }

    @Override
    public String toString() {
        return  "Numero stanze = " + getNumeroStanze() +
                "\nSuperficie = " + getSuperficie() +
                "\nIndirizzo = " + getIndirizzo() +
                "\nCittà = " + getCittà() + "\n";
    }
}    
