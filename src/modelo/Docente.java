package modelo;

public class Docente implements IDocente {
    private int nHoras;

    public Docente() {
    }

    public Docente(int nHoras) {
        this.nHoras = nHoras;
    }

    /**
     * @return the nHoras
     */
    public int getnHoras() {
        return nHoras;
    }

    /**
     * @param nHoras the nHoras to set
     */
    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    @Override
    public double cSalario() {
        return this.nHoras * Docente.VALOR_HORA;
    }

    @Override
    public double cBonificacion() {
        return this.cSalario() * Docente.BONIFICACION;
    }
    
    
}
