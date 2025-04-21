package Aula_05;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade_01 {
    public static void main(String[] args) {

        int[] vetor = {2,5,1,3,4,9,7,8,10,6};
        int posicao = -1;

        Scanner leia = new Scanner(System.in);

        System.out.println("-----------------------------------");
        for(int indice = 0; indice < vetor.length; indice++){
            System.out.print(vetor[indice]+", ");
        }
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.print("Digite o número que deseja encontrar: ");
        int alvo = leia.nextInt();

        for(int indice = 0; indice < vetor.length; indice++) {
            if (vetor[indice] == alvo) {
                posicao = indice;
                break;
            }
        }
        if(posicao != -1){
            System.out.println("O número "+alvo+" está localizado na posição: "+posicao);
        }else{
            System.out.println("O número "+alvo+" não foi encontrado!");
        }

    }
}
