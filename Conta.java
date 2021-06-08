public abstract class Conta {
//Atributos
private int numero;
private double saldo;
private Cliente cliente;
    
//Contrutor
public Conta(){}//default

//sobrecarregado-overload
public Conta(int numero, double saldo){
    this.numero = numero;
    this.saldo = saldo;
}

//getter/setters
    public double getSaldo() {
        return saldo;
    }
    public int getNumero() {
        return numero;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Cliente getCliente() {
        return cliente;
    }


//Métodos da classe
public boolean depositar(double valor){
    
    saldo +=valor;

    return true;
}
public boolean sacar(double valor){
        if((saldo - valor) >= 0){
            saldo -= valor;
            return true;
        }
      return false;

  
}
@Override
public String toString() {
    return "[Numero: " + numero + "; Saldo disponivel: " + saldo + ";]";
}


}