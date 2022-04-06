import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double change = Double.parseDouble(scanner.nextLine());
        double changeInCents = Math.round(change * 100);
        int counter = 0;

        while (changeInCents > 0) { // 56
            if (changeInCents >= 200) {
                changeInCents -= 200;
            } else if (changeInCents >= 100) {
                changeInCents = changeInCents - 100;
            } else if (changeInCents >= 50) {
                changeInCents = changeInCents - 50;
            } else if (changeInCents >= 20) {
                changeInCents = changeInCents - 20;
            } else if (changeInCents >= 10) {
                changeInCents = changeInCents - 10;
            } else if (changeInCents >= 5) {
                changeInCents = changeInCents - 5;
            } else if (changeInCents >= 2) {
                changeInCents = changeInCents - 2;
            } else if (changeInCents >= 1) {
                changeInCents = changeInCents - 1;
            }
            counter++;
        }

        System.out.println(counter);
    }
}