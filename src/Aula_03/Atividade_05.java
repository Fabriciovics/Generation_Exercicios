package Aula_03;

import java.util.Scanner;

public class Atividade_05 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);


        System.out.println("----------------------Tabela de produtos------------------------");
        System.out.println("Codigo do produto   |      Produto      |    Preço Unitario   |");
        System.out.println("        1           | Cachorro Quente   |             R$10.00 |");
        System.out.println("        2           | X-Salada          |             R$15.00 |");
        System.out.println("        3           | X-Bacon           |             R$18.00 |");
        System.out.println("        4           | Bauru             |             R$12.00 |");
        System.out.println("        5           | Refrigerante      |             R$8.00  |");
        System.out.println("        6           | Suco de laranja   |             R$13.00 |");

        System.out.println();
        System.out.println("Digite o codigo do produto: ");
        int codProduto = leia.nextInt();
        System.out.println("Quantidade: ");
        int quantidade = leia.nextInt();
        double total = 0 ;
        double preco = 0;

        switch (codProduto){
            case 1:
                System.out.println("Cachorro quente");
                preco = 10.00;
                total = quantidade * preco;
                System.out.printf("Valor Total: %.2f",total);
                break;
            case 2:
                System.out.println("X-Salada");
                preco = 15.00;
                total = quantidade * preco;
                System.out.printf("Valor Total: %.2f",total);
                break;
            case 3:
                System.out.println("X-Bacon");
                preco = 18.00;
                total = quantidade * preco;
                System.out.printf("Valor Total: %.2f",total);
                break;
            case 4:
                System.out.println("Bauru");
                preco = 12.00;
                total = quantidade * preco;
                System.out.printf("Valor Total: %.2f",total);
                break;
            case 5:
                System.out.println("Refrigerante");
                preco = 8.00;
                total = quantidade * preco;
                System.out.printf("Valor Total: %.2f",total);
                break;
            case 6:
                System.out.println("Suco de laranja");
                preco = 13.00;
                total = quantidade * preco;
                System.out.printf("Valor Total: %.2f",total);
                break;
        }
    }
}
