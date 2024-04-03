import java.util.Scanner;

public class ContagemDeNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numerosEntre0e100 = 0;
        int numerosEntre101e200 = 0;
        int numerosMaioresQue200 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int numero = scanner.nextInt();

            if (numero >= 0 && numero <= 100) {
                numerosEntre0e100++;
            } else if (numero >= 101 && numero <= 200) {
                numerosEntre101e200++;
            } else {
                numerosMaioresQue200++;
            }
        }

        System.out.println("Quantidade de números entre 0 e 100: " + numerosEntre0e100);
        System.out.println("Quantidade de números entre 101 e 200: " + numerosEntre101e200);
        System.out.println("Quantidade de números maiores que 200: " + numerosMaioresQue200);

        scanner.close();
    }
}
