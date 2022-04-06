import java.util.Scanner;

public class fruitShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quality = Double.parseDouble(scanner.nextLine());

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                if ("banana".equals(fruit)) {
                    System.out.printf("%.2f",quality * 2.50);
                } else if ("apple".equals(fruit)) {
                    System.out.printf("%.2f",quality * 1.20);
                } else if ("orange".equals(fruit)) {
                    System.out.printf("%.2f",quality * 0.85);
                } else if ("grapefruit".equals(fruit)) {
                    System.out.printf("%.2f",quality * 1.45);
                } else if ("kiwi".equals(fruit)) {
                    System.out.printf("%.2f",quality * 2.70);
                } else if ("pineapple".equals(fruit)) {
                    System.out.printf("%.2f",quality * 5.50);
                } else if ("grapes".equals(fruit)) {
                    System.out.printf("%.2f",quality * 3.85);
                } else {
                    System.out.println("error");
                }
                break;
            case "Saturday":
            case "Sunday":
                if ("banana".equals(fruit)) {
                    System.out.printf("%.2f",quality * 2.70);
                } else if ("apple".equals(fruit)) {
                    System.out.printf("%.2f",quality * 1.25);
                } else if ("orange".equals(fruit)) {
                    System.out.printf("%.2f",quality * 0.90);
                } else if ("grapefruit".equals(fruit)) {
                    System.out.printf("%.2f",quality * 1.60);
                } else if ("kiwi".equals(fruit)) {
                    System.out.printf("%.2f",quality * 3.00);
                } else if ("pineapple".equals(fruit)) {
                    System.out.printf("%.2f",quality * 5.60);
                } else if ("grapes".equals(fruit)) {
                    System.out.printf("%.2f",quality * 4.20);
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
