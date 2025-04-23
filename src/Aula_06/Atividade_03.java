package Aula_06;

import java.util.*;

public class Atividade_03 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int numeros = 0;
        Set<Integer> inteiros = new HashSet<>();

        System.out.println("Digite 10 numeros inteiros: ");
        for(int indice = 0; indice < 10; indice++){
            numeros = leia.nextInt();
            inteiros.add(numeros);
        }

        Iterator<Integer> iInteiros = inteiros.iterator();
        System.out.println("Listar dados do Set:");
        while(iInteiros.hasNext()){
            System.out.println(iInteiros.next());
        }
    }
}
