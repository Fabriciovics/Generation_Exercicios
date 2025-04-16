package Aula_03;

import java.util.Scanner;

public class Atividade_02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leia.nextInt();

        String parImpar, posNeg;

        if(numero % 2 == 0 ) {
           parImpar = "par";
        }else{
           parImpar = "impar";
        }

        if(numero > 0){
            posNeg = "positivo";
        }else{
            posNeg = "negativo";
        }

        System.out.println("O Numero "+ numero +" e "+ parImpar +" e "+ posNeg +"!");





    }
}
