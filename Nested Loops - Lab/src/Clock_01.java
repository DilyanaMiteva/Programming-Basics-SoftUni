import java.util.Scanner;

public class Clock_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ЧАСОВЕ: 0 ДО 23
        for (int hour = 0; hour <= 23; hour++) {
            //какво искаме да се повтаря за всеки един час -> минути от 0 до 59
            for (int minute = 0; minute <= 59; minute++) {
                System.out.printf("%d:%d%n", hour, minute);
            }
        }

    }
}