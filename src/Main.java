public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
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

    public static void task5 () {
        System.out.println("\n Задача 5 \n Високосные года с 1904 по 2096: \n");
        for (int  i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }
    }

    public static void task6 () {
        System.out.println("\n Задача 6 \n Последовательность чисел от 7 до 98: \n");
        for (int  i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }
    }

    public static void task7 () {
        System.out.println("\n Задача 7 \n Последовательность чисел от 1 до 512: \n");
        for (int  i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task8 () {
        System.out.println("\n Задача 8 \n Подсчет годовых накоплений: \n");
        int cashSaving = 29000;
        int total = 0;
        for (int i = 1; i < 12; i = i + 1) {
            total = total + cashSaving;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Сумма накоплений за год: " + total + " рублей \n");
    }

    public static void task9 () {
        System.out.println("\n Задача 9 \n Подсчет годовых накоплений с процентами: \n");
        int cashSaving = 29000;
        int total = 0;
        int month = 1;
        for (int i = 0; i < 12; i = i + 1) {
            total = total + total / 100;
            total = total + cashSaving;
            month = i + 1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("Сумма накоплений за год: " + total + " рублей \n");
    }

    public static void task10 () {
        System.out.println("\n Задача 10 \n Таблица умножения: ");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("2 * " + i +  " = " + (i * 2));
        }
    }
}