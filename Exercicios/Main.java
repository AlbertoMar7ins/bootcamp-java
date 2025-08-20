
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var isEmanciped = scanner.nextBoolean();
        var canDrive = age >= 18 || (isEmanciped && age >= 16);
        System.out.printf("Você pode dirigir? (%s)", canDrive);
    }

    // public static void bit(String[] args) {
    //     var value1 = 5;
    //     var binary1 = Integer.toBinaryString(value1);
    //     System.out.printf("Primeiro número da operação %s (representação binária %s)\n", value1, binary1);
    //     var value2 = 6;
    //     var binary2 = Integer.toBinaryString(value2);
    //     System.out.printf("Segundo número da operação %s (representação binária %s)\n", value2, binary2);
    //     var result = value1 | value2;
    //     var binaryResult = Integer.toBinaryString(result);
    //     System.out.printf("%s | %s = %s (Representação Binária %s)\n", value1, value2, result, binaryResult);
    // }
}

    /*
     *  0 = false
     *  1 = true
     */