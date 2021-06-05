package pierry;

import java.util.ArrayList;
import java.util.Scanner;

public class AppContas {
    public static void main(String[] args) {
        String nome, cpf;
        int num, menu;
        double saldo;
     
      ArrayList<Conta> lista = new ArrayList<> ();
      Scanner entrada = new Scanner(System.in);
       
      do{
        System.out.println("1-Adicionar Conta");
        System.out.println("2-Remover Conta");
        System.out.println("3-Listar Conta");
        System.out.println("4-Saque");
        System.out.println("5-Depósito");
        System.out.println("6-Sair");
        menu = entrada.nextInt();
        

        switch (menu) {
            case 1:
            System.out.println("Digite o numero da conta");
            num = entrada.nextInt();
            saldo= entrada.nextDouble();
            
            lista.add(new Corrente(num, saldo));
            
            break;
           
            case 2:
            System.out.println("oi");
           
            break;
           
            case 3:
            for (int i = 0; i < lista.size(); i++) {
              System.out.println(lista.get(i));
        
            }
           break;
           
           case 4:
            System.out.println("oi");
            break;
            case 5:
            System.out.println("oi");
            break;
        }

      }while(menu != 6);
         

    

      
    }
    
}
