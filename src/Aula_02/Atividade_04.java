package Aula_02;

import java.util.Scanner;

public class Atividade_04 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        float diferenca;

        System.out.print("Numero1: ");
        float numero1 = leia.nextFloat();
        System.out.print("Numero2: ");
        float numero2 = leia.nextFloat();
        System.out.print("Numero3: ");
        float numero3 = leia.nextFloat();
        System.out.print("Numero4: ");
        float numero4 = leia.nextFloat();

        diferenca = (numero1 * numero2)-(numero3 * numero4);

        System.out.printf("Diferença: %.1f",diferenca);
    }
}
