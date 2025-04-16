package Aula_04;

import java.util.Scanner;

public class Atividade_02 {
    public static void main(String[] args) {

        int totalPares = 0;
        int totalImpares = 0;

        Scanner leia = new Scanner(System.in);

        for(int contador = 1; contador <= 10; contador++){
            System.out.println("Digite o "+contador+"º número: ");
            int numero = leia.nextInt();
            if(numero %2 == 0){
                totalPares++;
            }else{
                totalImpares++;
            }
        }

        System.out.println("Total de números pares: "+totalPares);
        System.out.println("Total de números impares: "+totalImpares);
    }
}
