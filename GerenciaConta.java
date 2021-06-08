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
    //Precisa converter o String pra int (n lembro como desculpa) 
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

}

    
    

  

