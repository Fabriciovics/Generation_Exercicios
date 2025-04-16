package Aula_04;

import java.util.Scanner;

public class Atividade_06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        int multiplosDeTres = 0;
        int qtdMultiplosDeTres = 0;

        System.out.println("Digite números inteiros (digite 0 para sair):");

        do {
            System.out.print("Digite um número: ");
            numero = leia.nextInt();
            if (numero != 0 && numero % 3 == 0) {
                multiplosDeTres += numero;
                qtdMultiplosDeTres++;
            }
        } while (numero != 0);
            double media = (double) multiplosDeTres / qtdMultiplosDeTres;

            System.out.println("\nA média de todos os números múltiplos de 3 é: " + media);

    }
}
