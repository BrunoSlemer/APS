public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }
    
    //get e set
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        String s = "ContaEspecial";
        s += " limite: " + limite;
        s += "; " + super.toString();
        return s;
    }
    public boolean sacar(double valor){
        
        double saldoComLimite = super.getSaldo() + getLimite();
        
        if((saldoComLimite-valor)>=0){
            super.setSaldo(super.getSaldo()-valor);
        }
        return super.Sacar(valor);
    }
}
