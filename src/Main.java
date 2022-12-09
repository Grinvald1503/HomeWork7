public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        double total = 0;
        int months = 0;
        while(total < 2_459_000){
            total = total + 15000 + (total * 0.01);
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
        for(int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int population = 1000;
        int wasBorn = 17;
        int died = 8;
        for(int i = 1; i <= 10; i++) {
            population = population + wasBorn - died;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int total = 15000;
        int months = 0;
        while(total < 12_000_000) {
            total = total + (total / 100 * 7);
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
            total = total + (total / 100 * 7);
            months++;
            if(months % 6 == 0) {
                System.out.println(total);
            }
        }
        System.out.println(months);
    }
    public static void task6() {
        System.out.println("Задача 6");
        int total = 15000;
        int months = 12 * 9;
        for(int i = 1; i < months; i++) {
            total = total + (total / 100 * 7);
            if(i % 6 == 0) {
                System.out.println(total);
            }
        }
        System.out.println(months);
    }
    public static void task7() {
        System.out.println("Задача 7");
        int day = 5;
        while (day < 31) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            day = day + 7;
        }
    }
}