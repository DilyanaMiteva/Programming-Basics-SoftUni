import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine()); //100 000
        int secondNum = Integer.parseInt(scanner.nextLine());//100 050

        for (int i = firstNum; i <= secondNum; i++) {
            // i -> Шестцифрено число
            int evenSum = 0;
            int oddSum = 0;
            int copyNumber = i;
            boolean isEvenPosition = true;
            while (copyNumber > 0) {
                int currentDigit = copyNumber % 10;
                copyNumber = copyNumber / 10;
                if (isEvenPosition) {
                    evenSum += currentDigit;
                } else {
                    oddSum += currentDigit;
                }
                isEvenPosition = !isEvenPosition;
            }
            //Тук
            if(evenSum == oddSum){
                System.out.printf("%d ", i);
            }

        }
    }
}