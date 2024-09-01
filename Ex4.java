/*4. Faça um programa que simule um controle bancário. Para tanto, devem ser lidos os
códigos de dez contas e seus respectivos saldos. Os códigos devem ser armazenados
em um vetor de números inteiros (não pode haver mais de uma conta com o mesmo
código) e os saldos devem ser armazenados em um vetor de números reais. O saldo
deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta 504 foi
armazenada na quinta posição do vetor de códigos, seu saldo deverá ficar na quinta
posição do vetor de saldos. Depois de fazer a leitura dos valores, deverá aparecer o
seguinte menu na tela:
• Efetuar depósito
• Efetuar saque
• Consultar o ativo bancário (soma de todos os saldos)
• Finalizar programa
Obs.1: ao depositar, deve-se solicitar o valor e o código da conta a receber o depósito.
Obs.2: para sacar, a mesma coisa. Também, deve-se verificar se tem saldo suficiente
para o saque.
 */
import java.util.Scanner;
 public class Ex4 
{
   
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);
        int codigos[] = new int[10];
        float saldo[] = new float[10];

        for (int i=0;i<codigos.length;i++)
        {
            codigos[i] = i + 1;
        }
        for (int a=0;a<codigos.length;a++)
        {
            
            System.out.println("CLIENTE CÓDIGO "+codigos[a]);
            System.out.println("Informe o saldo do cliente:");
            saldo[a] = scanf.nextFloat();
        }
        
        System.out.println("\n\n\n\n\n");
        
        int op;
        do
        {

        System.out.println("1 - Efetuar depósito. ");
        System.out.println("2 - Efetuar saque. ");
        System.out.println("3 - Consultar ativo bancário. ");
        System.out.println("4 - Finalizar. ");
        op = scanf.nextInt();

        switch(op) 
        {
            case 1:
            
            int cod;
            float deposito;
            boolean encontrado = false;

            System.out.println("\nInforme o código da conta:");
            cod = scanf.nextInt();

            for (int i = 0; i < codigos.length; i++) 
            {
                if (cod == codigos[i]) 
                {
                    encontrado = true;
                    System.out.println("\nCódigo Encontrado.\n");
                    
                    System.out.println("Informe o valor de deposito:");
                    deposito = scanf.nextFloat();

                    if(deposito < 0)
                    {
                        System.out.println("\nInválido.\n");
                    }
                    if(encontrado)
                    {
                        saldo[i] += deposito;
                        System.out.println("\nDepósito realizado com sucesso.\n");

                    }

                    break;
                }
            }

            if (!encontrado) {
                System.out.println("\nCódigo inválido.\n");
                break;
            }

                break;
            
            case 2:

            int codi;
            float depositoo;
            float saque;
            boolean encontradoo = false;

            System.out.println("\nInforme o código da conta:");
            codi = scanf.nextInt();

            for (int codigoo : codigos)
            {
                if (codi == codigoo)
                {
                    encontradoo = true;
                    break;
                }
            }
            if(!encontradoo)
            {
                System.out.println("\nCódigo Inválido.\n");
                break;
            }

            if (encontradoo)
            {
                System.out.println("\nInforme o valor do saque:");
                saque = scanf.nextFloat();

                if (saque < 0) 
                {
                    System.out.println("Não foi possível realizar o saque.");
                    break;
                } 
                else 
                {
                    for (int i = 0; i < codigos.length; i++) 
                    {
                        if (codi == codigos[i]) 
                        {
                            if (saldo[i] >= saque) 
                            {
                                saldo[i] -= saque;
                                System.out.println("\nSaque realizado com sucesso.\n");
                                break;

                            } 
                            else 
                            {
                                System.out.println("\nSaldo insuficiente.\n");
                                break;
                            }
                    
                        }


                        }
                    }

                }

       
        
    
            case 3:

            int codii;
            boolean encontradodenovomeudeus = false;

            System.out.println("Informe o código da conta para consulta:");
            codii = scanf.nextInt();

            for (int c=0;c<codigos.length;c++)
            {

            if (codii == codigos[c])
            {
                encontradodenovomeudeus = true;
                System.out.println("\nCódigo encontrado.\n");
                System.out.println("Saldo atual: R$"+saldo[c]+"\n");
                break;
            }
            }
            if (!encontradodenovomeudeus)
            {
                System.out.println("\nCódigo não encontrado.\n");
                break;
            }
            break;

            case 4:
            System.out.println("Finalizando...");
            break;

        
            default:
            System.out.println("Opção inválida!");
                break;
        }
        
      

    }while (op != 4);
}
}
