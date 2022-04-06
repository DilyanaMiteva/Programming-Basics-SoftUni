import java.util.Scanner;

public class GraduationPt2_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int counter = 1;
        int lowScoreCounter = 0;
        double sum = 0;
        while (counter <= 12) {
            String value = scanner.nextLine();
            double evaluation = Double.parseDouble(value);
            sum += evaluation;
            if (evaluation < 4.00) {
                --counter;
                lowScoreCounter += 1;
                if (lowScoreCounter == 2) {
                    System.out.printf("%s has been excluded at %d grade", name, counter + 1);
                    break;
                }
            }
            counter++;
        }
        sum /= counter - 1;
        if (lowScoreCounter < 2)
            System.out.printf("%s graduated. Average grade: %.2f", name, sum);
    }
}
