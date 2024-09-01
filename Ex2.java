/*2. Faça um programa que, dados 2 vetores com 10 números inteiros cada, gere e imprima
um vetor dos números não comuns aos vetores */
import java.util.Scanner;

public class Ex2 
{
    public static void main(String[] args) 
    
    {
        Scanner scanf = new Scanner(System.in);

        int v1[] = new int[5];
        int v2[] = new int[5];
        int v3[] = new int[10];
        int cont=0;
        boolean comym = false;

        for (int i=0;i<v1.length;i++)
        {
            System.out.println("Informe o "+(i+1)+"º número do (1) vetor:");
            v1[i]= scanf.nextInt();

        }
        for (int id=0;id<v2.length;id++)
        {
            System.out.println("Informe o "+(id+1)+"º número do (2) vetor:");
            v2[id]= scanf.nextInt();

        }

        for (int i = 0; i < v1.length; i++) 
        {
            boolean comum = false;
            for (int j = 0; j < v2.length; j++) 
            {
                if (v1[i] == v2[j]) 
                {
                    comum = true;
                    break;
                }
            }
            if (!comum) 
            {
            
                v3[cont++] = v1[i];
            }
        }
        for (int i = 0; i < v2.length; i++) 
        {
            boolean comum = false;
            for (int j = 0; j < v1.length; j++) 
            {
                if (v2[i] == v1[j]) 
                {
                    comum = true;
                    break;
                }
            }
            if (!comum) 
            {
            
                v3[cont++] = v2[i];
            }
        }

        System.out.println("Vetor 1:");
        System.out.print("{ ");
        for (int i = 0; i < v1.length; i++) 
        {
            System.out.print(v1[i] + " ");
        }
        System.out.println("}");
        
        System.out.println("Vetor 2:");
        System.out.print("{ ");
        for (int i = 0; i < v2.length; i++) 
        {
            System.out.print(v2[i] + " ");
        }
        System.out.println("}");
        
        System.out.println("Vetor dos números não comuns:");
        System.out.print("{ ");
        for (int i = 0; i < cont; i++) 
        {
            System.out.print(v3[i] + " ");
        }
        System.out.println("}");

    }
    }

