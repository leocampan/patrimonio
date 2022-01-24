import java.util.*;

public class Villa extends Immobile {
    private int numeroPiani;
    private int superficieGiardino;
    private boolean piscina;


    public Villa() {
    }

    public Villa(int numeroStanze, int superficie, String indirizzo, String città, int numeroPiani, int superficieGiardino, boolean piscina) {
        super(numeroStanze, superficie, indirizzo, città);
        this.numeroPiani = numeroPiani;
        this.superficieGiardino = superficieGiardino;
        this.piscina = piscina;
    }

    public int getNumeroPiani() {
        return this.numeroPiani;
    }

    public void setNumeroPiani(int numeroPiani) {
        this.numeroPiani = numeroPiani;
    }

    public int getSuperficieGiardino() {
        return this.superficieGiardino;
    }

    public void setSuperficieGiardino(int superficieGiardino) {
        this.superficieGiardino = superficieGiardino;
    }

    public boolean isPiscina() {
        return this.piscina;
    }

    public boolean getPiscina() {
        return this.piscina;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public Villa numeroPiani(int numeroPiani) {
        setNumeroPiani(numeroPiani);
        return this;
    }

    public Villa superficieGiardino(int superficieGiardino) {
        setSuperficieGiardino(superficieGiardino);
        return this;
    }

    public Villa piscina(boolean piscina) {
        setPiscina(piscina);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Villa)) {
            return false;
        }
        Villa villa = (Villa) o;
        return numeroPiani == villa.numeroPiani && superficieGiardino == villa.superficieGiardino && piscina == villa.piscina && getIndirizzo() == villa.getIndirizzo() && getCittà() == villa.getCittà();
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroPiani, superficieGiardino, piscina);
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Numero piani =" + getNumeroPiani() +
                "\nSuperficie giardino = " + getSuperficieGiardino() +
                "\nPiscina = " + isPiscina() + "\n";
    }
}
