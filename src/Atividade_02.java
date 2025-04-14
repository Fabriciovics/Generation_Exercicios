import java.sql.SQLOutput;
import java.util.Scanner;

public class Atividade_02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        float media;

        System.out.print("Nota 1: ");
        float nota01 = leia.nextFloat();
        System.out.print("Nota 2: ");
        float nota02 = leia.nextFloat();
        System.out.print("Nota 3: ");
        float nota03 = leia.nextFloat();
        System.out.print("Nota 4: ");
        float nota04 = leia.nextFloat();

        media = (nota01 + nota02 + nota03 + nota04) / 4;

        System.out.printf("Média Final: %.1f", media);
    }
}
