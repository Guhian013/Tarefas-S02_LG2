import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("\n-----------");
        
        // Criando um objeto (instância) da classe Quadrado e atribuindo valor 5 para o atributo lado
        Quadrado q1 = new Quadrado();
        q1.setLado(5);   
        
        System.out.println("1º Quadrado\n");
        System.out.println("Lado: " + q1.getLado());
        System.out.println("Área: " + q1.calcularArea());
        System.out.println("Perímetro: " + q1.calcularPerimetro());
        
        System.out.println("-----------");
        
        Quadrado q2 = new Quadrado();
        q2.setLado(10);
        
        System.out.println("2º Quadrado\n");
        System.out.println("Lado: " + q2.getLado());
        System.out.println("Área: " + q2.calcularArea());
        System.out.println("Perímetro: " + q2.calcularPerimetro());
        
        System.out.println("-----------");
        
        // Criando um objeto (instância) da classe Retângulo e atribuindo valor 5 para o atributo base e o valor 10 para o atributo altura (base, altura);
        Retangulo r1 = new Retangulo();
        r1.setBase(5);
        r1.setAltura(10);
        
        System.out.println("1º Retângulo\n");
        System.out.println("Base: " + r1.getBase());
        System.out.println("Altura: " + r1.getAltura());
        System.out.println("Área: " + r1.calcularArea());
        System.out.println("Perímetro: " + r1.calcularPerimetro());
        
        System.out.println("-----------");
        
        Retangulo r2 = new Retangulo();
        r2.setBase(8);
        r2.setAltura(2);
        
        System.out.println("2º Retângulo\n");
        System.out.println("Base: " + r2.getBase());
        System.out.println("Altura: " + r2.getAltura());
        System.out.println("Área: " + r2.calcularArea());
        System.out.println("Perímetro: " + r2.calcularPerimetro());
        
        System.out.println("-----------");
        
        Retangulo r3 = new Retangulo();
        r3.setBase(13);
        r3.setAltura(14);
        
        System.out.println("3º Retângulo\n");
        System.out.println("Base: " + r3.getBase());
        System.out.println("Altura: " + r3.getAltura());
        System.out.println("Área: " + r3.calcularArea());
        System.out.println("Perímetro: " + r3.calcularPerimetro());
        
        System.out.println("-----------");
        
        // Criando um objeto (instância) da classe Circulo e atribuindo valor 10 para o atributo raio
        Circulo c1 = new Circulo();
        c1.setRaio(10);
        
        System.out.println("1º Circulo\n");
        System.out.println("Raio: " + c1.getRaio());
        System.out.println("Área: " + df.format(c1.calcularArea()));
        System.out.println("Perímetro: " + df.format(c1.calcularPerimetro()));
        
        System.out.println("-----------");
        
        Circulo c2 = new Circulo();
        c2.setRaio(6);
        
        System.out.println("2º Circulo\n");
        System.out.println("Raio: " + c2.getRaio());
        System.out.println("Área: " + df.format(c2.calcularArea()));
        System.out.println("Perímetro: " + df.format(c2.calcularPerimetro()));
        
        System.out.println("-----------");
        
        Circulo c3 = new Circulo();
        c3.setRaio(5);
        
        System.out.println("3º Circulo\n");
        System.out.println("Raio: " + c3.getRaio());
        System.out.println("Área: " + df.format(c3.calcularArea()));
        System.out.println("Perímetro: " + df.format(c3.calcularPerimetro()));
        
        System.out.println("-----------");

        System.out.println("\n----------- Conta -----------");
    
        Conta co1 = new Conta();
        co1.setCodigo(1);
        co1.setSaldo(0.0);
  
        Conta co2 = new Conta();
        co2.setCodigo(2);
        co2.setSaldo(100.00);
  
        co1.depositar(120.00);
        co2.depositar(50.00);
  
        System.out.println("\nSaque c1: " + co1.sacar(90.00));
        System.out.println("Saque c2: " + co2.sacar(200.00));
  
        System.out.println("\nTransferência c1: " + co1.transferir(co2, 10.00));
        System.out.println("Transferência c1: " + co1.transferir(co2, 300.00));

        System.out.println("\nSaldo c1: " + co1.getSaldo());
        System.out.println("Saldo c2: " + co2.getSaldo());
  
        System.out.println("-----------");
    }
}
