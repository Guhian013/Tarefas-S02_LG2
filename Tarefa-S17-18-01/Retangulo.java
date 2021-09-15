public class Retangulo {
    private int base;
    private int altura;

    public void setBase(int base) {
        this.base = base;
    } 

    public void setAltura(int altura) {
        this.altura = altura;
    } 

    public int calcularArea() {
        return base*altura;
    }

    public int calcularPerimetro() {
        return (2*base) + (2*altura);
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }
}
