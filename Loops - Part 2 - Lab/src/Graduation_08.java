import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int counter = 1;
        double sum = 0.0;
        //String input = scanner.nextLine();
        while (counter <= 12) {
            double evaluation = Double.parseDouble(scanner.nextLine());
            while (evaluation < 4.00) {
                evaluation = Double.parseDouble(scanner.nextLine());
            }
            sum += evaluation;
            counter++;

        }

        System.out.printf("%s graduated. Average grade: %.2f%n", name, sum/12);
    }
}
