package Aula_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade_01 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int opcao = 1;
        String nome = "";

        Queue<String> clientes = new LinkedList<String>();
        while(opcao != 0) {
            System.out.println("*************************************");
            System.out.println("1 - Adicionar Cliente na Fila");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Retirar Cliente da Fila");
            System.out.println("0 - Sair");
            System.out.println("*************************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = leia.nextInt();


            if (opcao == 1) {
                System.out.println("*** Adicionar Cliente na Fila ***");
                System.out.print("Digite o nome: ");
                leia.skip("\\R");
                nome = leia.nextLine();

                boolean verificador = clientes.add(nome);
                if (verificador) {
                    System.out.println("Cliente Adiconado!");
                }
                }else if(opcao == 2){
                    if(!clientes.isEmpty()) {
                        System.out.println("*** Listar todos os Clientes ***");
                        System.out.println("Fila: ");
                        clientes.forEach(System.out::println);
                    }else{
                        System.out.println("Fila vazia!");
                    }
                }else if(opcao == 3){
                    System.out.println("*** Retirar Cliente da Fila ***");
                    System.out.println("O "+clientes.peek()+" foi removido da fila!");
                    clientes.poll();
                    System.out.println("Fila Atual: ");
                    clientes.forEach(System.out::println);
                }else if(opcao == 0){
                    break;
                }else{
                    System.out.println("Entre com uma opção valida!");
                }
        }
    }
}
