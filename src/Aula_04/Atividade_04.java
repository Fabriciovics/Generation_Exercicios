package Aula_04;

import java.util.Scanner;

public class Atividade_04 {
    public static void main(String[] args) {

        int totalPessoas = 0;
        int somaIdade = 0;
        int pessoasBackend = 0;
        int mulheresCisETrans = 0;
        int homensCisETransM40 = 0;
        int naoBinarioFullStackMn30 = 0;
        double media = 0.0;
        String condicional = "S";

        Scanner leia = new Scanner(System.in);

        System.out.println("#######################");
        System.out.println("Identidade de Gênero:");
        System.out.println("1 – Mulher Cis");
        System.out.println("2 – Homem Cis");
        System.out.println("3 – Não Binário");
        System.out.println("4 – Mulher Trans");
        System.out.println("5 – Homem Trans");
        System.out.println("6 – Outros");
        System.out.println("#######################");
        System.out.println("Pessoa Desenvolvedora:");
        System.out.println("1 – Backend");
        System.out.println("2 – Frontend");
        System.out.println("3 – Mobile");
        System.out.println("4 – FullStack");
        System.out.println("#######################");
        System.out.println();

        System.out.println();

        while(condicional.equalsIgnoreCase("S")){

            System.out.print("Idade: ");
            int idade = leia.nextInt();

            System.out.print("Identidade de Gênero: ");
            int identidadeGenero = leia.nextInt();

            System.out.println("Pessoa Desenvolvedora: ");
            int pessoaDesenvolvedora = leia.nextInt();

            if (pessoaDesenvolvedora == 1) {
                pessoasBackend++;
            } else if (pessoaDesenvolvedora == 2) {
                if (identidadeGenero == 1 || identidadeGenero == 4) {
                    mulheresCisETrans++;
                }
            } else if (pessoaDesenvolvedora == 3) {
                if ((identidadeGenero == 2 || identidadeGenero == 5) && idade > 40) {
                    homensCisETransM40++;
                }
            } else if (pessoaDesenvolvedora == 4) {
                if (identidadeGenero == 3 && idade < 30) {
                    naoBinarioFullStackMn30++;
                }
            }

            totalPessoas++;
            somaIdade += idade;

            System.out.println("Deseja continuar(S/N): ");
            leia.skip("\\R");
            condicional = leia.nextLine();

            }

        media = (double) somaIdade / totalPessoas;

        System.out.println("Total de pessoas desenvolvedoras Backend: " + pessoasBackend);
        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresCisETrans);
        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensCisETransM40);
        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + naoBinarioFullStackMn30);
        System.out.println("O número total de pessoas que responderam à pesquisa:  " + totalPessoas);
        System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f\n", media);

        }
    }

