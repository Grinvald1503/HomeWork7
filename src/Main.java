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
    }

    public static void task1() {
        System.out.println("Задача 1");
        int total = 0;
        int contribution = 15000;
        int months = 0;
        while (total < 2_459_000) {
            int percent = total / 100;
            total = total + contribution + percent;
            months++;
            System.out.println(total);
        }
        System.out.println(months);

    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int statistics = 1000;
        int wasBorn = 17;
        int died = 8;
        for (int year = 1; year <= 10; year++) {
            population = population + (population / statistics * wasBorn) - (population / statistics * died);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int purpose = 12_000_000;
        int total = 15000;
        int months = 0;

        while (total < purpose) {
            int percent = total / 100 * 7;
            total = total + percent;
            months++;
            System.out.println(total);

        }
        System.out.println(months);
    }

    public static void task5() {
        System.out.println("Задача 5");
        int total = 15000;
        int months = 0;
        while (total < 12_000_000) {
            int percent = total / 100 * 7;
            total = total + percent;
            months++;
            if (months % 6 == 0) {
                System.out.println(total);
            }
        }
        System.out.println(months);
    }

    public static void task6() {
        System.out.println("Задача 6");
        int total = 15000;
        int months = 12 * 9;
        for (int month = 1; month < months; month++) {
            int percent = total / 100 * 7;
            total = total + percent;
            if (month % 6 == 0) {
                System.out.println(total);
            }
        }
        System.out.println(months);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int day = 5;
        while (day <= 31) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            day = day + 7;
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int age = 0;
        int currentYear = 2022;
        int age1 = currentYear - 200;
        int age2 = currentYear + 100;
        while (age < age2) {
            age = age + 79;
            if (age >= age1 && age <= age2) {
                System.out.println(age);
            }
        }

    }

}