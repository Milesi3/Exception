import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //divide(1,0);
        //readFromFile("file.txt");
        //getElementAtIndex(new int[] {5, 3, 5, 3},7);
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 5, 6};

        try {
            int[] diffArr = diffArrays(arr1, arr2);
            System.out.println(Arrays.toString(diffArr));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
    // Этот метод выдает значение, когда значение равно нулю.
    public static void divide(int dividend, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Делитель не может быть равен нулю");
        }
        int quotient = dividend / divisor;
        System.out.println("Result: " + quotient);
    }
    // Этот метод выдает не удается найти указаный файл, если указанное не существует.
    public static void readFromFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
    // Этот метод выдает значение, если значение выходит за пределы заданного параметра
    public static void getElementAtIndex(int[] array, int index) throws ArrayIndexOutOfBoundsException {
        System.out.println("Element at index " + index + ": " + array[index]);
    }

    /*
    Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
    каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. Если длины массивов не
    равны, необходимо как-то оповестить пользователя.
    */

    public static int[] diffArrays(int[] arr1, int[] arr2) throws IllegalArgumentException {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Массивы должны быть одинаковой длины");
        }

        int[] diffArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            diffArr[i] = arr1[i] - arr2[i];
        }

        return diffArr;
    }

}