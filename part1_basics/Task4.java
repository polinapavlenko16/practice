package part1_basics;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Введите элементы массива:");
        int i = 0;
        // Цикл do while для ввода
        do {
            arr[i] = scanner.nextInt();
            i++;
        } while (i < size);

        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        int j = 0;

        // Цикл while для обработки
        while (j < size) {
            sum += arr[j];
            if (arr[j] > max) max = arr[j];
            if (arr[j] < min) min = arr[j];
            j++;
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
        scanner.close();
    }
}
