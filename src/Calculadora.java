import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        //Calculadora
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double numero01 = leia.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double numero02 = leia.nextDouble();

        System.out.printf("\n%.2f + %f = %.2f",numero01,numero02,(numero01 + numero02));
        System.out.printf("\n%.2f + %f = %.2f",numero01,numero02,(numero01 - numero02));
        System.out.printf("\n%.2f + %f = %.2f",numero01,numero02,(numero01 * numero02));
        System.out.printf("\n%.2f + %f = %.2f",numero01,numero02,(numero01 / numero02));
        System.out.printf("\n%.2f ^ %f = %.2f",numero01,numero02,Math.pow(numero01, numero02));
        System.out.printf("\n%.2f R %f = %.2f",numero01,numero02,Math.sqrt(numero01));
    }
    }
}
