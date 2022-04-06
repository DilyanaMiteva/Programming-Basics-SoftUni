import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int input = 1;
        int min = Integer.MAX_VALUE;
        while(input <= n){
            int number = Integer.parseInt(scanner.nextLine());
            if(number < min){
                min = number;
            }
            input++;
        }
        System.out.println(min);
    }
}
