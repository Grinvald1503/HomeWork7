public class Main {
    public static void main(String[] args) {
        task1();
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

}