import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite a base do Retângulo: ");
        var base = sc.nextInt();
        System.out.println("Digite a altura do Retângulo: ");
        var height = sc.nextInt();
        var area = (base * height);
        System.out.printf("A área do retangulo e: %s", area);

    }
}
