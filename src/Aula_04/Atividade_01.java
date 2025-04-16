package Aula_04;

import java.util.Scanner;

public class Atividade_01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro numero do intervalo: ");
        int primeiroNum = leia.nextInt();
        System.out.print("Digite o ultimo numero do intervalo:  ");
        int segundoNum = leia.nextInt();

        if(primeiroNum >= segundoNum){
            System.out.println("Intervalo inválido!");
        }else{
            System.out.println("No intervalo entre "+primeiroNum+" e "+segundoNum+": ");
        }

       for(int contador = primeiroNum; contador <= segundoNum; contador++){
            if (contador % 3 == 0 && contador % 5 == 0) {
                System.out.println(contador + " é multiplo de 3 e 5!");
            }
        }
    }
}
