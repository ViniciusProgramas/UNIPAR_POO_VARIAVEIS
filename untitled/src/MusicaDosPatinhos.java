import java.util.Scanner;

public class MusicaDosPatinhos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inicial de patinhos: ");
        int numeroPatinhos = scanner.nextInt();

        while (numeroPatinhos > 0) {
            if (numeroPatinhos == 1) {
                System.out.println("1 patinho foi passear");
            } else {
                System.out.println(numeroPatinhos + " patinhos foram passear");
            }
            System.out.println("Além das montanhas\nPara brincar\nA mamãe gritou: Quá, quá, quá, quá");
            System.out.println();
            if (numeroPatinhos > 1) {
                System.out.println("Mas só " + (numeroPatinhos - 1) + " patinhos voltaram de lá\n");
            } else {
                System.out.println("Mas só voltou 1 patinho de lá\n");
            }
            numeroPatinhos--;
        }

        System.out.println("A mamãe patinha foi procurar\nAlém das montanhas\nNa beira do mar\n" +
                "A mamãe gritou: Quá, quá, quá, quá\nE os patinhos todos voltaram de lá.");

        scanner.close();
    }
}
