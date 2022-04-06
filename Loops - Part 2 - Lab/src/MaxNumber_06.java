import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int input = 1;
        int max = Integer.MIN_VALUE;
        while(input <= n){
            int number = Integer.parseInt(scanner.nextLine());
            if(number > max){
                max = number;
            }
            input++;
        }
        System.out.println(max);
    }
}
