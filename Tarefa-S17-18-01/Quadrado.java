public class Quadrado {
    private int lado;

    public void setLado(int lado) {
        if(lado > 0) {
            this.lado = lado;
        } else {
            throw new IllegalArgumentException("");
        }
    }
    
    public int calcularArea() {
        return lado * lado;
    }
    
    public int calcularPerimetro() {
        return 4 * lado;
    }

    public int getLado() {
        return lado;
    }
  
}
