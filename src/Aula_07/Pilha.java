package Aula_07;

import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {

        Stack<String> pilha = new Stack<String>();

        pilha.push("Comunicacao nao violenta");
        pilha.push("IT: a coisa");
        pilha.push("Coragem de ser imperfeito");
        pilha.push("Quem pensa enriquece");
        pilha.push("Diario de um banana");
        pilha.push("Senhor dos Aneis");
        pilha.push("O codigo da vinci");

        System.out.println(pilha);
        pilha.pop();
        System.out.println(pilha);
        pilha.push("Roube como um artista");
        System.out.println(pilha);
        System.out.println(pilha.peek());
        System.out.println("O livro diario de um banan existe na pilha? "+pilha.contains("Diario de um banana"));
    }
}
