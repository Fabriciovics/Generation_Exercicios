package Aula_04;

import java.util.Scanner;

public class Atividade_03 {
    public static void main(String[] args) {
        int idade = 0;
        int contador = 1;
        int menores = 0;
        int maiores = 0;

        Scanner leia = new Scanner(System.in);

        while(idade >= 0){
            System.out.print("Digite uma idade: ");
            idade = leia.nextInt();
            if(idade <= 21 ){
                menores++;
            }else if(idade >= 50){
                maiores++;
            }
            contador++;
        }
        System.out.println("Total de pessoas menores de 21 anos: "+menores);
        System.out.println("Total de pessoas maiores de 50 anos: "+maiores);
    }
}
