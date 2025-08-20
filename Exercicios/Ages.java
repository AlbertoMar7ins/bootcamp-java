import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Escreva o primeiro nome: ");
        var name1 = sc.next();
        System.out.println("Escreva o segundo nome: ");
        var name2 = sc.next();
        System.out.println("Escreva a idade da primeira pessoa: ");
        var age1 = sc.nextInt();
        System.out.println("Escreva a idade da segunda pessoa: ");
        var age2 = sc.nextInt();
        var diferenca = (age1 - age2);
        System.out.printf("A diferença de idade entre %s e %s é: %s", name1, name2, diferenca);

    }
}
