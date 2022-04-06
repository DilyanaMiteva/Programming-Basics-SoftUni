import java.util.Scanner;

public class CleverLily_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Вход
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double savedMoney = 0;
        int currentBirthdayMoney = 10;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                //Четни
                //Пари
                savedMoney = savedMoney + currentBirthdayMoney - 1;
                currentBirthdayMoney += 10;
            } else {
                //Нечетни
                //Играчка
                savedMoney += toyPrice; // savedMoney = savedMoney + toyPrice;
            }
        }
        if (savedMoney < washingMachine) {
            System.out.printf("No! %.2f", washingMachine - savedMoney);
        }else {
            System.out.printf("Yes! %.2f", savedMoney - washingMachine);
        }
    }
}
