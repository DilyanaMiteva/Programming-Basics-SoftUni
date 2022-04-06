import java.util.Scanner;

public class Salary_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countTabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        //Повтаряме : проверка на таба, изваждане от заплатата
        //За всеки един таб от 1 до последния
        for (int i = 1; i <= countTabs; i++) {
            String tabName = scanner.nextLine();
            switch (tabName) {
                case "Facebook":
                    salary = salary - 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
                    break;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > 0) {
            System.out.println(salary);
        }
    }
}