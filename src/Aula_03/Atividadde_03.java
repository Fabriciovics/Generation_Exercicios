package Aula_03;

import java.util.Scanner;

public class Atividadde_03 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome do doador: ");
        String nome = leia.nextLine();
        System.out.print("Digite a idade do doador: ");
        int idade = leia.nextInt();
        System.out.print("Priemeira doacao de sangue? ");
        boolean foiDoador = leia.nextBoolean();

        if (idade >= 18 && idade < 60)   {

            System.out.print(nome+" esta apto para doar sangue");

        } else if(idade >= 60 && foiDoador){

            System.out.print(nome+" esta apto para doar sangue");

        }else{
            System.out.println(nome+" nao esta apto para doar sangue");
        }



    }
}
