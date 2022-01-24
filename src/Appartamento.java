import java.util.*;

public class Appartamento extends Immobile {
    private int interno;
    private int piano;
    private int numeroTerrazzi;
    private boolean ascensore;

    public Appartamento() {
    }

    public Appartamento(int numeroStanze, int superficie, String indirizzo, String città, int interno, int piano, int numeroTerrazzi, boolean ascensore) {
        super(numeroStanze, superficie, indirizzo, città);
        this.interno = interno;
        this.piano = piano;
        this.numeroTerrazzi = numeroTerrazzi;
        this.ascensore = ascensore;
    }

    public int getInterno() {
        return this.interno;
    }

    public void setInterno(int interno) {
        this.interno = interno;
    }

    public int getPiano() {
        return this.piano;
    }

    public void setPiano(int piano) {
        this.piano = piano;
    }

    public int getNumeroTerrazzi() {
        return this.numeroTerrazzi;
    }

    public void setNumeroTerrazzi(int numeroTerrazzi) {
        this.numeroTerrazzi = numeroTerrazzi;
    }

    public boolean isAscensore() {
        return this.ascensore;
    }

    public boolean getAscensore() {
        return this.ascensore;
    }

    public void setAscensore(boolean ascensore) {
        this.ascensore = ascensore;
    }

    public Appartamento interno(int interno) {
        setInterno(interno);
        return this;
    }

    public Appartamento piano(int piano) {
        setPiano(piano);
        return this;
    }

    public Appartamento numeroTerrazzi(int numeroTerrazzi) {
        setNumeroTerrazzi(numeroTerrazzi);
        return this;
    }

    public Appartamento ascensore(boolean ascensore) {
        setAscensore(ascensore);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Appartamento)) {
            return false;
        }
        Appartamento appartamento = (Appartamento) o;
        return Objects.equals(interno, appartamento.interno) && piano == appartamento.piano && getIndirizzo() == appartamento.getIndirizzo() && getCittà() == appartamento.getCittà();
    }

    @Override
    public int hashCode() {
        return Objects.hash(interno, piano, numeroTerrazzi, ascensore);
    }

    @Override
    public String toString() {
        return  super.toString() + 
                "Interno =" + getInterno() +
                "\nPiano =" + getPiano() +
                "\nNumero terrazzi =" + getNumeroTerrazzi() +
                "\nAscensore =" + isAscensore() + "\n";
    }
    
}
