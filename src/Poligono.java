public abstract class Poligono {

    protected int nLados;

    public Poligono(int nLados) {
        this.nLados = nLados;
    }

    public double getNLados() {
        return nLados;
    }

    @Override
    public String toString() {
        return "número de lados - " + nLados;
    }

    // Declaramos abstracto para que sea implementado por las clases hijas
    public abstract double mostrarArea();

}