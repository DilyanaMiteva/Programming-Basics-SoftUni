import java.util.Scanner;

public class EvenPowersOf2_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int number = 1;
        for (int step = 0; step <= n; step += 2) {
            System.out.println(number);
            number *= 4;
        }
    }
}
