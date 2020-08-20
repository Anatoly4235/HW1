package ru.geekbrains.hw1;

public class Main {

    public static void main(String[] args) {

        System.out.println("Test");

        variables();
        System.out.println(printMath(5, 1, 6, 3));
        System.out.println(summBool(5, 8));
        System.out.println(positiveNumber(0));
        System.out.println(boolPositiveNumber(-5));
        helloName("Анатолий");
        leapYear();

    }

    static void variables() {

        System.out.println("Домашнее задание 20.08.2020");
        System.out.println("Задание №2. Инициализация переменных");
        int i = 10000;
        byte by = -100;
        short sh = 1000;
        long l = 1000000000L;
        float f = 10.1515151515f;
        double doub = 10.15;
        char ch = 'c';
        boolean result = true;

        System.out.println(i);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(l);
        System.out.println(f);
        System.out.println(doub);
        System.out.println(ch);
        System.out.println(result);

    }

    static int printMath(int a, int b, int c, int d) {

        System.out.println("Задание №3. Вычисление по формуле");
        return a * (b + (c / d));


    }

    static boolean summBool(int a, int b) {

        System.out.println("Задание №4. Вычисление суммы, попадает ли она в заданный предел");
        return a + b <= 20 && a + b >= 10;

    }

    static boolean positiveNumber(int x) {

        System.out.println("Задание №5. Поиск положительного числа");
        return x >= 0;

    }

    static boolean boolPositiveNumber(int x) {

        System.out.println("Задание №6. Поиск отрицательного числа числа");
        return x < 0;

    }

    static void helloName(String name) {

        System.out.println("Задание №7. Соединение параметра строки и текста");
        System.out.println("Привет, " + name + "!");

    }

    static void leapYear() {

        System.out.println("Задание №8*. Поиск високосного года");
        int y = 2020;
        if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0)) {
            System.out.println("Не високосный год");
        } else System.out.println("Високосный год");


    }

}
