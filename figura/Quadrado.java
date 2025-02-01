package figura;

public class Quadrado extends Figura {
    private double lado;

    public Quadrado(String cor, double lado) {
        super("quadrado", cor);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
