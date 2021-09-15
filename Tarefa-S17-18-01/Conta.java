public class Conta {
    Boolean teste;

    private int codigo;
    private double saldo;
    private double limite = 100.00;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setSaldo(double saldo) {
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

    public double getSaldo() {
        return saldo;
    }

    public int getCodigo() {
        return codigo;
    }
}
