package part1_basics;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            double num = 1.0 / i;
            // Форматирование вывода (4 знака после запятой)
            System.out.printf("%.4f\n", num);
        }
    }
}
