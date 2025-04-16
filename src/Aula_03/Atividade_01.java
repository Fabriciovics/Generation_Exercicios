package Aula_03;

import java.util.Scanner;

public class Atividade_01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int soma;

        System.out.println("Digite o número A: ");
        int numeroA = leia.nextInt();
        System.out.println("Digite o número B: ");
        int numeroB = leia.nextInt();
        System.out.println("Digite o número C: ");
        int numeroC = leia.nextInt();

        soma = numeroA + numeroB;

        if(soma > numeroC){
            System.out.println("A Soma de A + B é Maior do que C");
        }else if(soma < numeroC){
            System.out.println("A Soma de A + B é Menor do que C");
        }else{
            System.out.println("A Soma de A + B é Igual a C");
        }
    }
}
