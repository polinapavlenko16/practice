package part1_basics;

public class Task7 {
    public static void main(String[] args) {
        int number = 5;
        long result = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен: " + result);
    }

    // Метод для вычисления факториала
    public static long calculateFactorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
