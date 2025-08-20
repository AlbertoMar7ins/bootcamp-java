import java.time.OffsetDateTime;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        var baseYear = OffsetDateTime.now().getYear();
        var sc = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        var name = sc.next();
        System.out.println("Digite o ano de seu nascimento:");
        var year = sc.nextInt();
        var age = (baseYear - year);
        System.out.printf("Seu nome é %s e sua idade é %s", name, age);
    }
}
