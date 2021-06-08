import java.util.ArrayList;

public class GerenciaConta {
    private ArrayList<Conta> contas;

    public GerenciaConta() {
        contas = new ArrayList<>();

    }

   //Metodos 
    public void adicionar(Conta Conta) {
        contas.add(Conta);
    }
    public boolean remover(int numero) {

        for (Conta Conta : contas ){
           if(Conta.getNumero() == numero){
                contas.remove(Conta);
                return true;
            }
        }
     return false;
    }

  
    public String lista() {
     String saida = "-lista-\n" ;
      for (Conta Conta : contas){
          saida += Conta.toString() + "\n";
      }
      return saida;
      
      
    
    }
    public String mostrarCliente(String nome, String cpf){
        Cliente cliente = new Cliente(nome, cpf);

        cliente.setCpf(cpf);
        cliente.setNome(nome);
        return cliente.toString();
    }
    public boolean depositar(int numero,double valor) {

        for (Conta Conta : contas ){
           if(Conta.getNumero() == numero){
                Conta.depositar(valor);
                return true;
            }
        }
     return false;
    }
    public boolean sacar(int numero,double valor) {

        for (Conta Conta : contas ){
           if(Conta.getNumero() == numero){
                Conta.sacar(valor);
                return true;
            }
        }
     return false;
    }
    

}

    
    

  

