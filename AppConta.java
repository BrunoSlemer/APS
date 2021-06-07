public class AppConta {
    public static void main(String[] args) {
        
       ContaPoupança poupança = new ContaPoupança(54321, 200, 3.5);
       ContaCorrente corrente = new ContaCorrente(12345, 100);
       ContaEspecial especial = new ContaEspecial(11223, 300, 200);

       corrente.Depositar(50);
 
       System.out.println("Teste Conta Corrente");
       if(corrente.Sacar(120) == false){
           System.out.println("saque negado saldo insuficiente: " + corrente.getSaldo());
       }else{
           System.out.println("saque realizado");
       }
       System.out.println("novo saldo: " + corrente.getSaldo());
       System.out.println(corrente);
       
       corrente.Depositar(50);
       System.out.println(corrente);

       GerenciaConta gerencia = new GerenciaConta();

       gerencia.adicionar(poupança);
       gerencia.adicionar(corrente);
       System.out.println(gerencia.lista());
       
       System.out.println("Conta");
            int conta = 12345;
            if (gerencia.remover(conta)) {
                System.out.println("removido com sucesso.");
            } else {
                System.out.println("Erro. Placa não encontrada.");
            }
        
        System.out.println(gerencia.lista());            





       System.out.println("****************** **************** ******************  ******************");


       
       poupança.Depositar(50);
       System.out.println("Teste Conta Poupança");
       System.out.println("Saldo atual: " + poupança.getSaldo());
       double valor = 100; // simulando entrada
        if(poupança.Sacar(valor) == false){
        System.out.println("saque de "+ valor +" negado saldo insuficiente: " + poupança.getSaldo());
        }else{
        System.out.println("saque de "+ valor +" realizado " + "foi atribuida uma taxa de:" + poupança.getTaxa());
        }
        System.out.println("Novo saldo Poupanca: " + poupança.getSaldo());

        System.out.println("****************** **************** ******************  ******************");

        System.out.println("Teste Conta Especial");

        System.out.println(especial);

        double valor2 = 400;
        especial.Sacar(valor2);
        System.out.println("Saldo atual: " + especial.getSaldo());


    }   
}
