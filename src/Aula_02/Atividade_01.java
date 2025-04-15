package Aula_02;

import java.util.Scanner;

public class Atividade_01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double novoSalario;

        System.out.print("Digite o Salário: ");
        double salario = leia.nextDouble();
        System.out.print("Digite o Abono: ");
        double abono = leia.nextDouble();

         novoSalario = salario + abono;

        System.out.printf("Novo Salário: R$ %.2f", novoSalario);


    }
}
