public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
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
        double total = 0;
        int months = 0;
        while(total < 12_000_000) {
            total = total + 15000 + (total * 0.07);
            months++;
            System.out.println(total);
        }
        System.out.println(months);
    }
}