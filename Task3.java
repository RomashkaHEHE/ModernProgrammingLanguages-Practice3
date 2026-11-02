import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите N: ");
        int n = scanner.nextInt();
        double[] a = new double[n];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            a[i] = Double.parseDouble(scanner.next().replace(',', '.'));
        }

        double[] b = createB(a);
        System.out.println("Массив B:");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }

    static double[] createB(double[] a) {
        double[] b = new double[a.length];
        for (int k = 0; k < a.length; k++) {
            double sum = 0;
            for (int j = k; j < a.length; j++) {
                sum += a[j];
            }
            b[k] = sum / (a.length - k);
        }
        return b;
    }
}
