package Aula_03;

import java.util.Scanner;

public class Atividade_04 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String palavra1 = leia.nextLine();
        String palavra2 = leia.nextLine();
        String palavra3 = leia.nextLine();

        //Vertebrado
        if(palavra1.equalsIgnoreCase("vertebrado")){
            //Ave
            if(palavra2.equalsIgnoreCase("Ave")) {
                if(palavra3.equalsIgnoreCase("Carnivoro")){
                    System.out.println("Aguia");
                } else if(palavra3.equalsIgnoreCase("Onivoro")){
                    System.out.println("Pomba");
                }
            }else if(palavra2.equalsIgnoreCase("Mamifero")){
                 if(palavra3.equalsIgnoreCase("Carnivoro")){
                    System.out.println("Vaca");
                } else if(palavra3.equalsIgnoreCase("Onivoro")){
                    System.out.println("Homem");
                }
            }
        }
        //Invertebrado
        if(palavra1.equalsIgnoreCase("invertebrado")) {
            //Inseto
            if(palavra2.equalsIgnoreCase("Inseto")){
                if(palavra3.equalsIgnoreCase("Hematofago")){
                    System.out.println("Pulga");
                }
                else if(palavra3.equalsIgnoreCase("herbivoro")){
                    System.out.println("Lagarta");
                }
            } else if(palavra2.equalsIgnoreCase("Anelideo")){
                if(palavra3.equalsIgnoreCase("Hematofago")){
                    System.out.println("Sanguessuga");
                }
                else if(palavra3.equalsIgnoreCase("Onivoro")){
                    System.out.println("Minnhoca");
                }
            }
        }

    }
}
