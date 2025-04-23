package Aula_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Atividade_02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int opcao = 1;
        String nome = "";

        Stack<String> livros = new Stack<String>();

        while(opcao != 0) {
            System.out.println("*************************************");
            System.out.println("1 - Adicionar Livro na Pilha");
            System.out.println("2 - Listar todos os Livros");
            System.out.println("3 - Retirar Livro da pilha");
            System.out.println("0 - Sair");
            System.out.println("*************************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = leia.nextInt();


            if (opcao == 1) {
                System.out.println("*** Adicionar Livro na Pilha ***");
                System.out.print("Digite o nome: ");
                leia.skip("\\R");
                nome = leia.nextLine();

                boolean verificador = livros.add(nome);
                if (verificador) {
                    System.out.println("Cliente Adiconado!");
                }
            }else if(opcao == 2){
                System.out.println("*** Listar todos os Livros ***");
                System.out.println("Pilha: ");
                livros.forEach(System.out::println);
            }else if(opcao == 3){
                System.out.println("*** Retirar Livro da pilha ***");
                System.out.println("O "+livros.peek()+" foi removido da fila!");
                livros.pop();
                System.out.println("Pilha Atual: ");
                livros.forEach(System.out::println);
            }else if(opcao == 0){
                break;
            }else{
                System.out.println("Entre com uma opção valida!");
            }
        }
    }
}
