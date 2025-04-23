package Aula_06;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ColecaoArrayList {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ArrayList<Double> numeros = new ArrayList<>();

        numeros.add(2.0);
        numeros.add(5.0);
        numeros.add(8.0);
        numeros.add(3.0);
        numeros.add(2.0);

        for(var numero : numeros){
            System.out.println(numero);
        }
        System.out.println("Indice do numero 5: "+numeros.indexOf(5.0));

        System.out.println("O numero 5 existe na colecao?  "+numeros.contains(5.0));

        System.out.println("Qual valor esta armazenado no indice 2?  "+numeros.get(2));

        numeros.set(2, 4.0);

        System.out.println("Qual valor esta armazenado no indice 2?  "+numeros.get(2));

        System.out.println("Exibe os dados apos a atualizacao: ");
        numeros.forEach(System.out::println);

        numeros.remove(4.0);

        System.out.println("Exibe os dados apos a exclusao: ");
        numeros.forEach(System.out::println);

        System.out.println("QUal tamanho da colecao? "+numeros.size());
        //LImpar colecao
        //numeros.clear();
        System.out.println("A colecao esta vazia? "+ numeros.isEmpty());

        numeros.sort(null);
        System.out.println("Exibe os dados em ordem crescente: ");
        numeros.forEach(System.out::println);

        numeros.sort(Comparator.reverseOrder());
        System.out.println("Exibe os dados em ordem decrescente: ");
        numeros.forEach(System.out::println);



    }
}
