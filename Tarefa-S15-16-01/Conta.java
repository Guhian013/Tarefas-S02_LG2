public class Conta {
    Boolean teste;

    public int codigo;
    public double saldo;
    public double limite = 100.00;

    public Conta(int codigo, double saldo) {
        this.codigo = codigo;
        this.saldo = saldo;
    }
  
    public Boolean depositar(double valor) {
        saldo = saldo + valor;
        return true;
    }
  
    public Boolean sacar(double valor) {
        if(saldo >= valor && valor <= limite) {
            saldo = saldo - valor;
            teste = true;
        } else if(saldo < valor && valor > limite) {
            teste = false;
        }
        return teste;
    }
  
    public Boolean transferir(Conta conta, double valor) {
        if(saldo >= valor && valor <= limite) {
            saldo = saldo - valor;
            conta.saldo = conta.saldo + valor;
            teste = true;
        } else if(saldo < valor && valor > limite) {
            teste = false;
        }
        return teste;
    }
}
