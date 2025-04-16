package Aula_04;

import java.util.Scanner;

public class Atividade_05 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número inteiro (digite 0 para sair): ");
            numero = leia.nextInt();
            if (numero > 0) {
                soma += numero;
            }
        } while (numero != 0);

        System.out.println("A soma dos números positivos  é: "+soma);

    }
}
