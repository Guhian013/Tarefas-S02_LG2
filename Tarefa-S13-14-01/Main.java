class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.codigo = 1;
        c1.saldo = 0.0;
  
        Conta c2 = new Conta();
        c2.codigo = 2;
        c2.saldo = 100.00;
  
        c1.depositar(120.00);
        c2.depositar(50.00);
  
        System.out.println("\nSaque c1: " + c1.sacar(90.00));
        System.out.println("Saque c2: " + c2.sacar(200.00));
  
        System.out.println("\nTransferência c1: " + c1.transferir(c2, 10.00));
        System.out.println("Transferência c1: " + c1.transferir(c2, 300.00));

        System.out.println("\nSaldo c1: " + c1.saldo);
        System.out.println("Saldo c2: " + c2.saldo);
  
        System.out.println("");
    }
}
