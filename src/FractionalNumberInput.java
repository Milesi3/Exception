import java.util.Scanner;

public class FractionalNumberInput {
    public static float readFractionalNumber() {
        Scanner scanner = new Scanner(System.in);
        float value = 0.0f;
        boolean validInput = false;
        while (!validInput) {
            System.out.print("Введите дробное число: ");
            if (scanner.hasNextFloat()) {
                value = scanner.nextFloat();
                validInput = true;
            } else {
                System.out.println("Неверный Ввод. Пожалуйста, введите дробное число.");
                scanner.next(); // очистить входной буфер
            }
        }
        return value;
    }
    public static void exercise3() {
        try {
            int a = 90;
            int b = 0;
            System.out.println(a / b);

            printSum(23, 234);

            int[] abc = { 1, 2 };
            // Fix: проверяет, находится ли индекс в пределах границ перед доступом
            if (abc.length > 3) {
                abc[3] = 9;
            }
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
    public static void EmptyStringExceptionExample() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите непустую строку: ");
        String input = scanner.nextLine();

        try {
            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя!");
            }
            System.out.println("Результат: " + input);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

}
