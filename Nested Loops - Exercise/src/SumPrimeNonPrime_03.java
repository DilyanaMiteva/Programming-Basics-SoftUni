import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine()); //100 000
        int secondNum = Integer.parseInt(scanner.nextLine());//100 050

        for (int i = firstNum; i <= secondNum; i++) {
            // i -> Шестцифрено число
            int evenSum = 0;
            int oddSum = 0;
            int copyNumber = i;

            String numberAsString = copyNumber + "";

            for (int j = 0; j < numberAsString.length(); j++) {
                char currentDigit = numberAsString.charAt(j);
                int digitAsInteger = Integer.parseInt(currentDigit + "");
                if(j % 2  == 0){
                    oddSum+= digitAsInteger;
                } else {
                    evenSum+= digitAsInteger;
                }
            }
            //Тук
            if (evenSum == oddSum) {
                System.out.printf("%d ", i);
            }

        }
    }
}