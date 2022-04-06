import java.util.Scanner;

public class tradeCommissions_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        switch (town) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    double commissions = 0.05 * sales;
                    System.out.printf("%.2f", commissions);
                } else if (sales > 500 && sales <= 1000) {
                    double commissions = 0.07 * sales;
                    System.out.printf("%.2f", commissions);
                } else if (sales > 1000 && sales <= 10000) {
                    double commissions = 0.08 * sales;
                    System.out.printf("%.2f", commissions);
                } else if (sales > 10000) {
                    double commissions = 0.12 * sales;
                    System.out.printf("%.2f", commissions);
                } else {
                    System.out.printf("error");
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    double commissions = 0.045 * sales;
                    System.out.printf("%.2f", commissions);
                } else if (sales > 500 && sales <= 1000) {
                    double commissions = 0.075 * sales;
                    System.out.printf("%.2f", commissions);
                } else if (sales > 1000 && sales <= 10000) {
                    double commissions = 0.1 * sales;
                    System.out.printf("%.2f", commissions);
                } else if (sales > 10000) {
                    double commissions = 0.13 * sales;
                    System.out.printf("%.2f", commissions);
                } else {
                    System.out.printf("error");
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    double commissions = 0.055 * sales;
                    System.out.printf("%.2f", commissions);
                } else if (sales > 500 && sales <= 1000) {
                    double commissions = 0.08 * sales;
                    System.out.printf("%.2f", commissions);
                } else if (sales > 1000 && sales <= 10000) {
                    double commissions = 0.12 * sales;
                    System.out.printf("%.2f", commissions);
                } else if (sales > 10000) {
                    double commissions = 0.145 * sales;
                    System.out.printf("%.2f", commissions);
                } else {
                    System.out.printf("error");
                }
                break;
            default:
                System.out.printf("error");
        }
    }
}
