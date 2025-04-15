package Aula_02;

import java.util.Scanner;

public class Atividade_03 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        float salarioLiquido;

        System.out.print("Salario Bruto: ");
        float salarioBruto = leia.nextFloat();
        System.out.print("Adicional Noturno: ");
        float adicionalNoturno = leia.nextFloat();
        System.out.print("Horas Extras:");
        float horasExtras = leia.nextFloat();
        System.out.print("Descontos: ");
        float descontos = leia.nextFloat();

        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        System.out.printf("Salário Liquido: %.2f",salarioLiquido);

    }
}
