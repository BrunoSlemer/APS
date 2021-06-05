public abstract class Conta {
//Atributos
private int numero;
private double saldo;
    
//Contrutor
public Conta(){}//default

//sobrecarregado-overload
public Conta(int numero, double saldo){
    this.numero = numero;
    this.saldo = saldo;
}

//getter/setters

//Métodos da classe
public boolean Depositar(double deposito){
    
    saldo = saldo + deposito;

    return true;
}
public boolean Sacar(double saque){

        saldo = saldo - saque;
        return true;

  
}
@Override
public String toString() {
    return super.toString();
}


}