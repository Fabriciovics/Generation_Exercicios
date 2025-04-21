package Aula_05;

import java.util.Scanner;

public class Atividade_02 {
    public static void main(String[] args) {

        int soma = 0;
        double media = 0;
        int[] vetor = new int[10];

        Scanner leia = new Scanner(System.in);

        for(int indice = 0; indice < vetor.length; indice++){
            System.out.print("Digite um numero: ");
            vetor[indice] = leia.nextInt();
        }

        System.out.println("Elementos nos índices ímpares: ");
        for(int indice = 0; indice < vetor.length; indice++){
            soma += vetor[indice];
            if (indice % 2 != 0) {
                System.out.print( vetor[indice]+" ");
            }
        }
        System.out.println();
        System.out.println("Elementos pares: ");
        for(int indice = 0; indice < vetor.length; indice++){
            if(vetor[indice] % 2 == 0){
                System.out.print( vetor[indice]+" ");
            }
        }
        media = (double)soma / 10;
        System.out.println();
        System.out.print("Soma: "+soma);
        System.out.println();
        System.out.printf("Media: %.2f",media);
    }
}
