public class ContaCorrente extends Conta {
    
    public ContaCorrente(int numero, double saldo){
        super( numero, saldo);
    
    }

    @Override
    public String toString() {
        
        return "Conta Corrente " + super.toString();
    }

    
    public boolean Sacar(int numero ,double valor) {
        
        return super.Sacar(valor);
    }


    

    
}
