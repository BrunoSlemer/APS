import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        GerenciaConta gerencia = new GerenciaConta();    
        Scanner teclado = new Scanner(System.in);        
        int opcao, opcao2;
        int numero;
        double saldo, limite,taxa;
        Conta conta;

    do {
        System.out.println("1-Adicionar Conta");
        System.out.println("2-Remover Conta");
        System.out.println("3-Listar Conta");
        System.out.println("4-Sacar da Conta");
        System.out.println("5-Depositar na Conta");
        System.out.println("6-sair");

        opcao = Integer.parseInt(teclado.nextLine());

        switch (opcao) {
            case 1:
                System.out.println("Qual Conta deseja adicionar?");
                System.out.println("1-Conta Correte");
                System.out.println("2-Conta Especial");
                System.out.println("3-Conta Poupança");
                opcao2 = Integer.parseInt(teclado.nextLine());
                switch (opcao2) {

                    case 1://Conta Corrente
                        
                        System.out.println("Qual o Numero da Conta?");
                        numero = Integer.parseInt(teclado.nextLine());
                        System.out.println("Qual o Saldo inicial da Conta?");
                        //saldo = Double.parseDouble(teclado.nextLine());
                        teclado.nextLine();
                        saldo = teclado.nextDouble();
                        conta = new ContaCorrente(numero, saldo);
                        gerencia.adicionar(conta);
                        break;
                    
                    case 2://Conta  Especial
                        System.out.println("Qual o Numero da Conta?");
                        numero = Integer.parseInt(teclado.nextLine());
                        System.out.println("Qual o Saldo inicial da Conta?");
                        saldo = Double.parseDouble(teclado.nextLine());
                        System.out.println("Qual o Limite adicional para a Conta?");
                        limite = Double.parseDouble(teclado.nextLine());
                        conta = new ContaEspecial(numero, saldo, limite);
                        gerencia.adicionar(conta);
                        break;

                    case 3://Conta Poupanca
                        System.out.println("Qual o Numero da Conta?");
                        numero = Integer.parseInt(teclado.nextLine());
                        System.out.println("Qual o Saldo inicial da Conta?");
                        saldo = Double.parseDouble(teclado.nextLine());
                        System.out.println("Qual a taxa a ser cobrada na Conta?");
                        taxa = Double.parseDouble(teclado.nextLine());
                        conta = new ContaPoupança(numero, saldo, taxa);
                        gerencia.adicionar(conta);
                        break;

                    default:
                        
                        System.out.println("Opção inválida");

                        break;
                }


                break;
        
            case 2:
                System.out.println("Qual o numero da Conta a ser Removida?");
                numero = Integer.parseInt(teclado.nextLine());
                ;
                if (gerencia.remover(numero)) {
                System.out.println("removida com sucesso.");
                } else {
                System.out.println("Erro. Conta não encontrada.");
                }
                
                break;
        
            case 3:

                System.out.println("Lista de Contas:");
                System.out.println(gerencia.lista());
                break;
        
            case 4:
                System.out.println("Qual o numero da Conta para o Saque?");
                numero = teclado.nextInt();
                
                
                break;
        
            case 5:
                
                break;
            case 6:
                
                break;
        
            default:
                
                System.out.println("Opção inválida");
                
            }

        } while (opcao != 6);
        teclado.close();
    }
}
