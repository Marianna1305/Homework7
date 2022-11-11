public class Main {
    public static void main(String[] args) {
//  Циклы часть 2
//  ДЗ1 Задание 1
        System.out.println("ДЗ1 Задание 1");
        int month = 0;
        int sum = 0;
        while (sum < 2_459_000) {
            sum = sum + sum / 100 + 15_000;
            month = month + 1;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        System.out.println();
//  ДЗ1 Задание 2
        System.out.println("ДЗ1 Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println();
//  ДЗ1 Задание 3
        System.out.println("ДЗ1 Задание 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int j = 0;
        for (; j < 10; j++) {
            population = population + (fertility - mortality) * population / 1000;
        }
        System.out.println("год " + j + " численность населения составляет " + population);
        System.out.println();
//  ДЗ2 Задание 1,2
        System.out.println("ДЗ2 Задание 1,2");
        int sumTotal = 15_000;
        int term = 1;
        for (; sumTotal < 12_000_000; term++) {
            sumTotal += sumTotal * 0.07;
            if (term % 6 == 0) {
                System.out.println("Месяц " + term + ", сумма накоплений равна " + sumTotal + " рублей");
            }
        }
        System.out.println();
//  ДЗ2 Задание 3
        System.out.println("ДЗ2 Задание 3");
        int sumTotal1 = 15_000;
        int term1 = 1;
        for (; term1 <= 9 * 12; term1++) {
            sumTotal1 += sumTotal1 * 0.07;
            if (term1 % 6 == 0) {
                System.out.println("Месяц " + term1 + ", сумма накоплений равна " + sumTotal1 + " рублей");
            }
        }
        System.out.println();
//  ДЗ2 Задание 4
        System.out.println("ДЗ2 Задание 4");
        int firstFriday = 5;
        for (int dayOfMonth = firstFriday; dayOfMonth <= 31; dayOfMonth += 7) {
            System.out.println("Сегодня пятница, " + dayOfMonth + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();
//  ДЗ3 Задание 1
        System.out.println("ДЗ3 Задание 1");
        int currentYear = 2022;
        for (int year = currentYear - 200; year < currentYear + 100; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
        System.out.println();
//  ДЗ3 Задание 2
        System.out.println("ДЗ3 Задание 2");
        int number = 2;
        for (int n = 1, result = 0; n <= 10; n++) {
            result = number * n;
            System.out.println(result);
        }
        System.out.println();
    }
}