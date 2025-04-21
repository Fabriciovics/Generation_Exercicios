package Aula_05;

import java.util.Scanner;

public class Atividade_03 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int indice = 0; indice < matriz.length; indice++) {
            for (int coluna = 0; coluna < matriz[indice].length; coluna++) {
                System.out.print("Digite um numero: ");
                matriz[indice][coluna] = leia.nextInt();
            }
        }

        System.out.print("Elementos da Diagonal Principal: ");
        int somaDiagonalPrincipal = 0;
        for (int indice = 0; indice < matriz.length; indice++) {
            System.out.print(matriz[indice][indice] + " ");
            somaDiagonalPrincipal += matriz[indice][indice];
        }

        System.out.println();

        System.out.print("Elementos da Diagonal Secundária: ");
        int somaDiagonalSecundaria = 0;
        for (int indice = 0; indice < matriz.length; indice++) {
            System.out.print(matriz[indice][matriz.length - 1 - indice] + " ");
            somaDiagonalSecundaria += matriz[indice][matriz.length - 1 - indice];
        }

        System.out.println();

        System.out.println("Soma dos Elementos da Diagonal Principal: " + somaDiagonalPrincipal);
        System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaDiagonalSecundaria);
    }
}
