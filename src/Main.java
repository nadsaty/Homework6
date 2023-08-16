public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("\n Задача 1 \n Числа по порядку: \n");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }
    }

    public static void task2 () {
        System.out.println("\n Задача 2 \n Числа в обратном порядке: \n");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }
    }

    public static void task3 () {
        System.out.println("\n Задача 3 \n Четные числа от 0 до 17: \n");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
    }

    public static void task4 () {
        System.out.println("\n Задача 4 \n Числа в обратном порядке от 10 до -10: \n");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }
    }
}