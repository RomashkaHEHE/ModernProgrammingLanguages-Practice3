import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите чётное N: ");
        int n = scanner.nextInt();
        double[] a = new double[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            a[i] = Double.parseDouble(scanner.next().replace(',', '.'));
        }

        for (int i = 1; i < n; i += 2) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
