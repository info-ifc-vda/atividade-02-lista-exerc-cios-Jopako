/*3. Faça um programa que dados 2 vetores inteiros de tamanhos 10 e 5, respectivamente,
calcule e mostre 2 vetores resultantes:
• no primeiro vetor resultante, cada elemento será composto pela soma de cada
número par do primeiro vetor somado a todos os números do segundo vetor;
• o segundo vetor resultante será composto pela quantidade de divisores que cada
número ímpar do primeiro vetor tem no segundo vetor.
 */
import java.util.Scanner;
public class Ex3

{
    public static void main(String[] args) 
    
    {
        Scanner scanf = new Scanner(System.in);
       int cont=0;
        int vetor1[] = new int[10];
        int vetor2[] = new int [5];
        int cont2=0;
        int auxpt2=0;
        

        System.out.println("Preencha o (1) vetor:\n");
        for (int i=0;i<vetor1.length;i++)
        {
            System.out.println("("+(i+1)+"º)-Número:");
            vetor1[i]=scanf.nextInt();
            
        }
        System.out.println("\n\n\n");

        System.out.println("Preencha o (2) vetor:\n");
        for (int i=0;i<vetor2.length;i++)
        {
            System.out.println("("+(i+1)+"º)-Número:");
            vetor2[i]=scanf.nextInt();
        }
        System.out.println("\n\n\n");

        for(int i =0;i<vetor1.length;i++)
        {
        if (vetor1[i] % 2 == 0)
        {
            cont++;       
        }
        else
        {
            cont2++;
        }
    }

        int vetor3[] = new int [cont];
        int aux = 0;


        int vetor4[] = new int [cont2];

    

        for(int i =0;i<vetor1.length;i++)
        {
        if (vetor1[i] % 2 == 0)
        {
            vetor3[aux++] = vetor1[i];
        }
        else
        {
            vetor4[auxpt2++] = vetor1[i];
        }
        }
        for(int i=0;i<vetor3.length;i++)
        {
            vetor3[i] += vetor2[i];
        }


        
        int[] vetor4total = new int[vetor4.length];

        for (int i = 0; i < vetor4.length; i++) 
        {
            int numDivisores = 0;
            
            for (int j = 0; j < vetor2.length; j++) 
            {
                if (vetor4[i] % vetor2[j] == 0)
                 {
                    numDivisores++;
                }
            }
            vetor4total[i] = numDivisores;
        }

            
        System.out.println("Vetor 1:");
System.out.printf("{");
        for (int i=0;i<vetor1.length;i++)
        {
            System.out.printf(+vetor1[i]+",");
        }
System.out.println("}");
System.out.println("\nVetor 2:");
System.out.printf("{");
        for (int i=0;i<vetor2.length;i++)
        {
            System.out.printf(+vetor2[i]+",");
        }
System.out.println("}");

System.out.println("\nVetor 3:");
System.out.printf("{");
        for (int i=0;i<vetor3.length;i++)
        {
            System.out.printf(+vetor3[i]+",");
        }
System.out.println("}");

System.out.println("\nVetor 4:");
System.out.printf("{");
        for (int i=0;i<vetor4total.length;i++)
        {
            System.out.printf(+vetor4total[i]+",");
        }
System.out.println("}");


    }
}
