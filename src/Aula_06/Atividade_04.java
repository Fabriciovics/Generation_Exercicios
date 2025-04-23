package Aula_06;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade_04 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numero = 0;
        boolean buscador = false;

        Set<Integer> inteiros = new HashSet<Integer>();

        inteiros.add(2);
        inteiros.add(4);
        inteiros.add(8);
        inteiros.add(10);
        inteiros.add(1);
        inteiros.add(5);
        inteiros.add(6);
        inteiros.add(9);
        inteiros.add(0);
        inteiros.add(3);

        System.out.println("Digite o número que você deseja encontrar: ");
        numero = leia.nextInt();
        buscador = inteiros.contains(numero);

        if (buscador){
            System.out.println("O número "+numero+ " foi encontrado.");
        }else{
            System.out.println("O número "+numero+" não foi encontrado!");
        }


    }
}
