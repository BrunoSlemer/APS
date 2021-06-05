public class AppConta {
    public static void main(String[] args) {
        
       ContaCorrente corrente = new ContaCorrente(12345, 100);
      
       //corrente.Depositar(50);
 
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
       System.out.println("****************** **************** ******************  ******************");


       ContaPoupança poupança = new ContaPoupança(54321, 200, 3.5);
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

    }   
}
