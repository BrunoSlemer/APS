public class ContaPoupança extends Conta {
    private static double taxa;

    public ContaPoupança(int numero, double saldo, double taxa){
        super(numero, saldo);
        ContaPoupança.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }
    public static void setTaxa(double taxa) {
        ContaPoupança.taxa = taxa;
    }
    @Override
    public int getNumero() {
        return super.getNumero();
    }
    @Override
    public double getSaldo() {

        return super.getSaldo();
    }
    @Override
    public boolean Sacar(double valor) {
        valor += taxa;
        
        return super.Sacar(valor);
    }

}
