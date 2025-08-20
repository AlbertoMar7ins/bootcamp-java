import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado do Quadrado:");
        var side1 = sc.nextInt();
        var area = (side1 * side1);
        System.out.printf("A área do quadrado é %s", area);
    }
}
