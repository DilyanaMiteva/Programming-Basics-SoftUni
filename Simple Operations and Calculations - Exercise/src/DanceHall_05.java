import java.util.Scanner;

public class DanceHall_05 {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        double hallLength = Double.parseDouble(myScanner.nextLine());
        double hallWidth = Double.parseDouble(myScanner.nextLine());
        double wardrobeSide = Double.parseDouble(myScanner.nextLine());

        double areaOfHall = (hallLength * 100) * (hallWidth * 100);
        double areaOfWardrobe = (wardrobeSide * 100) * (wardrobeSide * 100);
        double areaOfBench = areaOfHall * 0.1;

        double freeSpace = areaOfHall - areaOfWardrobe - areaOfBench;
        double spaceForDancer = 7040;
        double countOfDancers = Math.floor(freeSpace / spaceForDancer);
        System.out.printf("%.0f", countOfDancers);


    }
}
