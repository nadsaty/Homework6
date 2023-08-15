public class Main {

    public static void main(String[] args) {
        task1();
        task2();
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
}