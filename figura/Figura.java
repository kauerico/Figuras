package figura;

public abstract class Figura {
    private String tipo;
    private String cor;

    public Figura(String tipo, String cor) {
        this.tipo = tipo;
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double calcularArea() {
        return 0; // Retorna 0 por padrão
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + " - cor: " + cor + " - área: " + calcularArea();
    }
}
