import java.util.Scanner;

public class DivisionWithoutRemainder_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = Integer.parseInt(scanner.nextLine());
        //I ->   2
        //II ->  3
        //III -> 4
        int groupTwo = 0;
        int groupThree = 0;
        int groupFour = 0;

        for (int i = 1; i <= numberCount; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if(currentNumber % 2 == 0){
                groupTwo++; // groupTwo = groupTwo + 1;
            }
            if (currentNumber % 3 == 0){
                groupThree++;
            }
            if(currentNumber % 4 == 0){
                groupFour++;
            }
        }
        System.out.printf("%.2f%%%n", 1.0 * groupTwo / numberCount * 100);
        System.out.printf("%.2f%%%n", 1.0 *groupThree / numberCount * 100);
        System.out.printf("%.2f%%%n", 1.0 *groupFour / numberCount * 100);
    }
}