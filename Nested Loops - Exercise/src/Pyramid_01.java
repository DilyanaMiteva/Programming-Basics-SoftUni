import java.util.Scanner;

public class Pyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int currentNumber = 1;
        boolean isBigger = false;

        for (int rows = 0; rows < n; rows++) {
            //Ред
            for (int cols = 0; cols <= rows; cols++) {
                System.out.printf("%d ", currentNumber);
                currentNumber++;
                if(currentNumber > n){
                    isBigger = true;
                    break;
                }
            }
            if(isBigger){
                break;
            }
            System.out.println();
        }
    }
}