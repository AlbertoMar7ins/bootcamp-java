public class Vetores {
    public static void main(String[] args) {
        // Declarar
        int[] numeros = new int[10];
        // int[] idades = {18, 21, 33, 45};

        // Armazenamento
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[5] = 60;

        // Obter
        // int num = numeros[0];
        // System.out.println(num);
        // System.out.println(numeros[0]);
        // System.out.println(numeros[1]);
        // System.out.println(numeros[5]);

        for (int i = 0; i < numeros.length; i++){
            System.out.print("Posição " + i);
            System.out.print(" Valor " + numeros[i]);
            System.out.println();
        }
    }
}