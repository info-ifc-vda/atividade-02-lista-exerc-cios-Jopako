/*1. Faça um programa que leia um conjunto não determinado de valores, um de cada vez, e
escreva uma tabela com cabeçalho, que deve ser repetido a cada vinte linhas. A tabela
deverá conter o valor lido, seu cubo e sua raiz quadrada. Finalize quando a entrada for
um número negativo ou 0. */
import java.util.Scanner;
public class Ex1
{
    public static void main (String[] args)
    {
        Scanner scanf = new Scanner(System.in);
        int vetn[] = new int[20];
        int aux=0;
        int valor=0;
        double vcubo[] = new double[20];
        double vraiz[] = new double[20];
        
        while (2>1)
        {            
            System.out.println("Informe um número inteiro e postivo: ");
            valor = scanf.nextInt();

            if (valor <= 0) {
                System.out.println("\nSaindo...");
                break;
            }

            vetn[aux] = valor;
            vcubo[aux] = Math.pow(valor, 3);
            vraiz[aux] = Math.sqrt(valor);
            aux++;

            if (aux == 20)
            {
                System.out.println("------------------------------------------------------");
                System.out.println("| Valor |  Cubo  | Raiz Quadrada |");
                System.out.println("------------------------------------------------------");

                for (int i=0;i<20;i++)
                {
                    System.out.printf( "|   |" +vetn[i]+ "|       |" +vcubo[i]+ "|       |" +vraiz[i]+"|\n");

                }

                aux = 0;

            }
    

    }
}

}