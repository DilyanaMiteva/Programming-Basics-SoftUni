import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfContribution = Integer.parseInt(scanner.nextLine());
        int contribution = 1;
        double total = 0;

        while (contribution <= countOfContribution) {
            double amount = Double.parseDouble(scanner.nextLine());

            if (amount < 0){
                System.out.printf("Invalid operation!%n");
                break;
            }

                System.out.printf("Increase: %.2f%n", amount);
            total += amount;
            contribution++;
        }
        System.out.printf("Total: %.2f", total);
    }
}
