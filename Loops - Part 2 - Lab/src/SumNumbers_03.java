import java.sql.SQLOutput;
import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = 0;
        while (!input.equals("Stop")){
            int currentNumber = Integer.parseInt(input);
            sum += currentNumber;
            input = scanner.nextLine();
        }
        System.out.println(sum);
    }
}
