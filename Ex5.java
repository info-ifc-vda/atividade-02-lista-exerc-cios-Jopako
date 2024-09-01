/*5. Faça um programa que preencha uma matriz 7x7 de números inteiros e crie dois vetores
com sete posições cada um que contenham, respectivamente, o maior elemento de
cada uma das linhas e o menor elemento de cada uma das colunas. Escreva a matriz
e os dois vetores gerados.
 */
import java.util.Scanner;

public class Ex5 
{
    public static void main(String[] args) 
    {
        Scanner scanf = new Scanner(System.in);
        int linha = 7;
        int coluna = 7;
        int[][] matriz = new int[linha][coluna];
        int[] maiorlinha = new int[linha];
        int[] menorcoluna = new int[coluna];

        System.out.println("Preencha a Matriz " + linha + " X " + coluna + ":");
        for (int i = 0; i < linha; i++) 
        {
            for (int j = 0; j < coluna; j++) 
            {
                System.out.println("Digite o valor para a posição [" + i + "][" + j + "]:");
                matriz[i][j] = scanf.nextInt();
            }
        }

        for (int i = 0; i < linha; i++) 
        {
            int maior = matriz[i][0];
            for (int j = 1; j < coluna; j++)
             {
                if (matriz[i][j] > maior) 
                {
                    maior = matriz[i][j];
                }
            }
            maiorlinha[i] = maior;
        }

        for (int j = 0; j < coluna; j++) 
        {
            int menor = matriz[0][j];
            for (int i = 1; i < linha; i++) 
            {
                if (matriz[i][j] < menor) 
                {
                    menor = matriz[i][j];
                }
            }
            menorcoluna[j] = menor;
        }

        System.out.println("\nMatriz preenchida:");
        for (int i = 0; i < linha; i++) 
        {
            for (int j = 0; j < coluna; j++) 
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Maior elemento de cada linha:");
        for (int i = 0; i < linha; i++) {
            System.out.print(maiorlinha[i] + " ");
        }
        System.out.println();

        System.out.println("Menor elemento de cada coluna:");
        for (int j = 0; j < coluna; j++) {
            System.out.print(menorcoluna[j] + " ");
        }
        System.out.println();
    }
}
