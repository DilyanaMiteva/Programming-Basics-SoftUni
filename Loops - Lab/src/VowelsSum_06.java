import java.util.Scanner;

public class VowelsSum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int sum = 0;
        //за всяка една позиция от 0 до последната
        //вземем кой символ се намира на съответната позиция
        //проверка за символа
        for (int position = 0; position <= word.length() - 1 ; position++) {
            char symbol = word.charAt(position);
            //a e   i   o   u
            switch (symbol){
                case 'a':
                    //1
                    sum = sum + 1; //sum += 1;
                    break;
                case 'e':
                    //2
                    sum += 2;
                    break;
                case 'i':
                    //3
                    sum += 3;
                    break;
                case 'o':
                    //4
                    sum += 4;
                    break;
                case 'u':
                    //5
                    sum += 5;
                    break;
            }
        }

        System.out.println(sum);

    }
}
