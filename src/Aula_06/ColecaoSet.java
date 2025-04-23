package Aula_06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {
    public static void main(String[] args) {

        Set<String> frutas = new HashSet<String>();
        frutas.add("Maca");
        frutas.add("Morango");
        frutas.add("Abacate");
        frutas.add("Laranja");
        frutas.add("Maca");

        System.out.println(frutas);

        for(var fruta : frutas){
            System.out.println(fruta.hashCode());
        }

        System.out.println("Morango existe na colecao? "+ frutas.contains("Morango"));

        //frutas.remove("Morango");

        Iterator<String> ifrutas = frutas.iterator();

        while(ifrutas.hasNext()){
            System.out.println(ifrutas.next());
        }

        ArrayList<String> frutasList = new ArrayList<String>();

        frutasList.addAll(frutas);
        frutasList.sort(null);

        System.out.println("EXibir dados Arraylist: ");
        frutasList.forEach(System.out::println);
    }
}