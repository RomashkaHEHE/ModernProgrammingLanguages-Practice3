import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            if (!scanner.hasNextLine()) {
                break;
            }
            String command = scanner.nextLine().trim();

            if (command.equals("1")) {
                double[] legs = input(scanner);
                if (legs == null) {
                    break;
                }
                double c = calculate(legs);
                output(legs, c);
            } else if (command.equals("2")) {
                System.out.println("Расчёт гипотенузы прямоугольного треугольника по двум катетам.");
            } else if (command.equals("3")) {
                System.out.println("Кузнеченко Роман Евгеньевич, РИ-250911.");
            } else if (command.equals("0") || command.equalsIgnoreCase("выход")) {
                break;
            } else {
                System.out.println("Неизвестная команда. Повторите ввод.");
            }
        }
    }

    static void printMenu() {
        System.out.println("1. Выполнить расчёт");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("0. Выход");
        System.out.print("Выберите пункт: ");
    }

    static double[] input(Scanner scanner) {
        double[] legs = new double[2];
        for (int i = 0; i < legs.length; i++) {
            while (true) {
                System.out.print("Введите катет " + (i + 1) + " или 'выход': ");
                if (!scanner.hasNextLine()) {
                    return null;
                }
                String text = scanner.nextLine().trim();
                if (text.equalsIgnoreCase("выход")) {
                    return null;
                }

                try {
                    double value = Double.parseDouble(text.replace(',', '.'));
                    if (check(value)) {
                        legs[i] = value;
                        break;
                    }
                } catch (NumberFormatException e) {
                }

                System.out.println("Нужно положительное число. Повторите ввод.");
            }
        }
        return legs;
    }

    static boolean check(double value) {
        return Double.isFinite(value) && value > 0;
    }

    static double calculate(double[] legs) {
        return Math.hypot(legs[0], legs[1]);
    }

    static void output(double[] legs, double c) {
        System.out.println("Первый катет: " + legs[0]);
        System.out.println("Второй катет: " + legs[1]);
        System.out.println("Гипотенуза: " + c);
    }
}
