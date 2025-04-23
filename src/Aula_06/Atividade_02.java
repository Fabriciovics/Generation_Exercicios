package Aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int entrada = 0;
        boolean buscador = false;
        ArrayList<Integer> inteiros = new ArrayList<>();

        inteiros.add(3);
        inteiros.add(10);
        inteiros.add(5);
        inteiros.add(8);
        inteiros.add(1);
        inteiros.add(12);
        inteiros.add(17);
        inteiros.add(7);
        inteiros.add(0);
        inteiros.add(9);

        System.out.print("Digite o número que você deseja encontrar: ");
        entrada = leia.nextInt();
        buscador = inteiros.contains(entrada);

        if(buscador){
            System.out.println("O número "+entrada+ " está localizado na posição: "+inteiros.indexOf(entrada));
        }else{
            System.out.println("O número "+entrada+" não foi encontrado!");
        }
    }
}
