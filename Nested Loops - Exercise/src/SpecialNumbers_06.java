import java.util.Scanner;

public class SpecialNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int specialDigit = Integer.parseInt(scanner.nextLine());

        for (int currentNumber = 1111; currentNumber < 9999; currentNumber++) {
            //Дали всяка от цифрите на currentNumber дели specialDigit без остатък
            String copyNum = currentNumber + "";
            boolean isSpecial = true;
            for (int i = 0; i < copyNum.length(); i++) {
                char currentDigit = copyNum.charAt(i);
                int digitAsInteger = Integer.parseInt(currentDigit + "");
                if(digitAsInteger == 0){
                    isSpecial = false;
                    break;
                }
                if(specialDigit % digitAsInteger != 0){
                    isSpecial = false;
                    break;
                }
            }
            if(isSpecial){
                System.out.print(currentNumber+ " ");
            }
        }
    }
}