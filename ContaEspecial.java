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
        String s = " Conta Especial:";
        
        s += " " + super.toString();
        s += " limite adicional: " + limite;
        return s;
    }
    @Override
    public boolean sacar(double valor){
        
        double saldoComLimite = super.getSaldo() + limite;
        double s1 = super.getSaldo() - valor;

        if (s1 >= 0){
            
            super.setSaldo(s1);
            return true;


        }
        else if((saldoComLimite - valor)>=0 && (s1 < 0)){
                

                setLimite(limite + s1);
                super.setSaldo(0);
                return true;
            }
        return false;
    }
    
}
