import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // 1.1 Создать двумерный массив, заполнить его случайными числами.
        int[][] array = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100);
            }
        }

        // 1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] += number;
            }
        }

        // 1.3 Найти сумму всех получившихся элементов и вывести в консоль
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        System.out.println("Сумма всех элементов: " + sum);
    }
}
