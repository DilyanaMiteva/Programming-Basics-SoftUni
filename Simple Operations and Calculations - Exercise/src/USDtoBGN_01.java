import java.util.Scanner;

public class USDtoBGN_01 {
    public static void main(String[] args) {
        //1. usd -> колко долара ще конвертираме
        //2. bgn = usd * 1.79549
        //3. Принтираме до втория знак
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;
        System.out.printf("%.2f", bgn);
    }
}
