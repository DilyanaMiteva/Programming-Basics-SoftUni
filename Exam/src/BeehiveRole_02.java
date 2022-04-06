import java.util.Scanner;

public class BeehiveRole_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intelect = Integer.parseInt(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        String sex = scanner.nextLine();
        if (intelect >= 80 && power >= 80 && sex.equals("female")) {
            System.out.printf("Queen Bee");
        } else if (intelect >= 80) {
            System.out.printf("Repairing Bee");
        } else if (intelect >= 60){
            System.out.printf("Cleaning Bee");
        }else if (power>=80 && sex.equals("male")){
            System.out.printf("Drone Bee");
        }else if (power>=60){
            System.out.printf("Guard Bee");
        }else {
            System.out.printf("Worker Bee");
        }
    }
}