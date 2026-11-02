import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите нечётное N: ");
        int n = scanner.nextInt();
        int[][] a = new int[n][n];

        System.out.println("Введите матрицу по строкам:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        for (int layer = 0; layer < n / 2; layer++) {
            int last = n - 1 - layer;

            for (int i = layer; i < last; i++) {
                System.out.print(a[i][layer] + " ");
            }
            for (int j = layer; j < last; j++) {
                System.out.print(a[last][j] + " ");
            }
            for (int i = last; i > layer; i--) {
                System.out.print(a[i][last] + " ");
            }
            for (int j = last; j > layer; j--) {
                System.out.print(a[layer][j] + " ");
            }
        }

        System.out.println(a[n / 2][n / 2]);
    }
}
