import java.util.Scanner;

public class NumberSequence_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        //за всяко едно число от 1 до n
        //повтаряме: прочитаме си стойността, проверим дали е макс или мин
        //преминаваме към следващото
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            //стойността е макс
            if (value > max) {
                max = value;
            }

            //проверка за стойността дали е мин
            if (value < min) {
                min = value;
            }
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);

    }
}
