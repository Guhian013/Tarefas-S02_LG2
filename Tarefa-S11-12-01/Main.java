import java.text.DecimalFormat;

class Main {
  public static void main(String[] args) {
    DecimalFormat df = new DecimalFormat("0.00");

    // Criando um objeto (instância) da classe Quadrado e atribuindo valor 5 para o atributo lado
    Quadrado q1 = new Quadrado(5);   
    
    System.out.println("\n1º Quadrado\n");
    System.out.println("Lado: " + q1.lado);
    System.out.println("Área: " + q1.calcularArea());
    System.out.println("Perímetro: " + q1.calcularPerimetro());
    
    System.out.println("-----------");
    
    Quadrado q2 = new Quadrado(10);
    
    System.out.println("2º Quadrado\n");
    System.out.println("Lado: " + q2.lado);
    System.out.println("Área: " + q2.calcularArea());
    System.out.println("Perímetro: " + q2.calcularPerimetro());
  
    System.out.println("-----------");

    // Criando um objeto (instância) da classe Retângulo e atribuindo valor 5 para o atributo base e o valor 10 para o atributo altura (base, altura);
    Retangulo r1 = new Retangulo(5, 10);

    System.out.println("1º Retângulo\n");
    System.out.println("Base: " + r1.base);
    System.out.println("Altura: " + r1.altura);
    System.out.println("Área: " + r1.calcularArea());
    System.out.println("Perímetro: " + r1.calcularPerimetro());

    System.out.println("-----------");

    Retangulo r2 = new Retangulo(8, 2);

    System.out.println("2º Retângulo\n");
    System.out.println("Base: " + r2.base);
    System.out.println("Altura: " + r2.altura);
    System.out.println("Área: " + r2.calcularArea());
    System.out.println("Perímetro: " + r2.calcularPerimetro());

    System.out.println("-----------");

    Retangulo r3 = new Retangulo(13, 14);

    System.out.println("3º Retângulo\n");
    System.out.println("Base: " + r3.base);
    System.out.println("Altura: " + r3.altura);
    System.out.println("Área: " + r3.calcularArea());
    System.out.println("Perímetro: " + r3.calcularPerimetro());

    System.out.println("-----------");

    // Criando um objeto (instância) da classe Circulo e atribuindo valor 10 para o atributo raio
    Circulo c1 = new Circulo(10);

    System.out.println("1º Circulo\n");
    System.out.println("Raio: " + c1.raio);
    System.out.println("Área: " + df.format(c1.calcularArea()));
    System.out.println("Perímetro: " + df.format(c1.calcularPerimetro()));

    System.out.println("-----------");

    Circulo c2 = new Circulo(6);

    System.out.println("2º Circulo\n");
    System.out.println("Raio: " + c2.raio);
    System.out.println("Área: " + df.format(c2.calcularArea()));
    System.out.println("Perímetro: " + df.format(c2.calcularPerimetro()));

    System.out.println("-----------");

    Circulo c3 = new Circulo(5);

    System.out.println("3º Circulo\n");
    System.out.println("Raio: " + c3.raio);
    System.out.println("Área: " + df.format(c3.calcularArea()));
    System.out.println("Perímetro: " + df.format(c3.calcularPerimetro()));

    System.out.println("-----------");
  }
}
