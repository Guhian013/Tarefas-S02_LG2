public class Circulo {
    Double pi = 3.1416;
    int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

    public Double calcularArea() {
        return pi * (Math.pow(raio, 2));
    }

    public Double calcularPerimetro() {
        return 2 * pi * raio;
    }
    
}
