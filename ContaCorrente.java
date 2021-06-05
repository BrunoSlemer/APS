public class ContaCorrente extends Conta {
    
    public ContaCorrente(int numero, double saldo){
        super( numero, saldo);
    
    }

    @Override
    public boolean Depositar(double deposito) {
        
        return super.Depositar(deposito);
    }
    
    @Override
    public boolean Sacar(double saque) {
        if(saldo - saque < saldo){

        }
        return super.Sacar(saque);
    }
    
}
