import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa:");
        System.out.print("Anos: ");
        int anos = scanner.nextInt();

        System.out.print("Meses: ");
        int meses = scanner.nextInt();

        System.out.print("Dias: ");
        int dias = scanner.nextInt();

        int idadeEmDias = calcularIdadeEmDias(anos, meses, dias);

        System.out.println("A idade expressa em dias é: " + idadeEmDias + " dias.");

        scanner.close();
    }

    public static int calcularIdadeEmDias(int anos, int meses, int dias) {
        int idadeEmDias = (anos * 365) + (meses * 30) + dias;
        return idadeEmDias;
    }
}
