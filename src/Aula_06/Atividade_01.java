package Aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        String cor = "";
        int count = 0;
        ArrayList<String> cores = new ArrayList<>();

        for (int indice = 0; indice < 5; indice++) {
            count = indice + 1;
            System.out.print("Digite a "+count+"ª cor: " );
            cor = leia.nextLine();
            cores.add(cor);
        }

        System.out.println();

        System.out.println("Listar todas as cores: ");
        cores.forEach(System.out::println);

        System.out.println();

        System.out.println("Ordenar as cores: ");
        cores.sort(null);
        cores.forEach(System.out::println);
    }
}
