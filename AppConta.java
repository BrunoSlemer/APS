import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        GerenciaConta gerencia = new GerenciaConta();    
        Scanner teclado = new Scanner(System.in);        
        int opcao, opcao2;
        int numero;
        double saldo, limite,taxa, valor;
        Conta conta;
        String nome, cpf;

        System.out.println("Qual o nome do cliente?");
        nome = teclado.nextLine();
        System.out.println("Qual o cpf do cliente?");
        cpf = teclado.nextLine();
        
        


    do {
        System.out.println("conta de:"+ gerencia.mostrarCliente(nome, cpf));
        System.out.println("1-Adicionar Conta");
        System.out.println("2-Remover Conta");
        System.out.println("3-Listar Conta");
        System.out.println("4-Sacar da Conta");
        System.out.println("5-Depositar na Conta");
        System.out.println("6-sair");

        opcao = Integer.parseInt(teclado.nextLine());

        switch (opcao) {
            case 1: // adicionar conta
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
                        saldo = Double.parseDouble(teclado.nextLine());
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
        
            case 2: //Remover Conta
                System.out.println("Qual o numero da Conta a ser Removida?");
                numero = Integer.parseInt(teclado.nextLine());
                ;
                if (gerencia.remover(numero)) {
                System.out.println("removida com sucesso.");
                } else {
                System.out.println("Erro. Conta não encontrada.");
                }
                
                break;
        
            case 3://Listar Conta

                System.out.println("Lista de Contas:");
                System.out.println(gerencia.lista());
                break;
        
            case 4: //Sacar da Conta
                System.out.println("Qual o numero da Conta para o Saque: ");
                numero = Integer.parseInt(teclado.nextLine());
                System.out.println("Qual o valor do Saque: ");
                valor = Double.parseDouble(teclado.nextLine());
                if (gerencia.sacar(numero,valor)) {
                    System.out.println("Saque de: "+valor+" realizado com sucesso.");
                    } else {
                    System.out.println("Erro. Saque não realizado.");
                    }
                
                break;
        
            case 5://Depositar na Conta
                System.out.println("Qual o numero da Conta para Deposito: ");
                numero = Integer.parseInt(teclado.nextLine());
                System.out.println("Qual o valor do Deposito: ");
                valor = Double.parseDouble(teclado.nextLine());
                if (gerencia.depositar(numero,valor)) {
                    System.out.println("Deposito de: "+valor+" realizado com sucesso.");
                    } else {
                    System.out.println("Erro. Deposito não realizado.");
                    }

                
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
