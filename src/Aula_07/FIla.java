package Aula_07;

import java.util.LinkedList;
import java.util.Queue;

public class FIla {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<String>();

        fila.add("Carlos");
        fila.add("Giovanna");
        fila.add("Livia");
        fila.add("Maria");
        fila.add("Samuel");
        fila.add("Fabricio");
        fila.add("Victor");

        System.out.println(fila); // EXibe a fila
        fila.remove();// Retiramos um elemento da fila
        System.out.println(fila);
        fila.add("thiago");//Adiconamos um elemento no final da fila
        System.out.println(fila);
        System.out.println(fila.peek());//Exibimos o primeiro elemento da fila
        System.out.println(fila);
        System.out.println(fila.poll());// Exibimos e removemos o primeiro elemento da fila
        System.out.println(fila);
        System.out.println("A maria esta na fila? "+fila.contains("Maria"));
        System.out.println("O Carlos esta na fila? "+fila.contains("Carlos"));
        System.out.println("Qual o tamanho da fila? "+fila.size());

        int contador = 0;
        for(var pessoa : fila){
            contador++;
             if(pessoa.equalsIgnoreCase("Maria")){
                 System.out.println("Posicao: "+ contador);
             }
        }
;
    }
}
