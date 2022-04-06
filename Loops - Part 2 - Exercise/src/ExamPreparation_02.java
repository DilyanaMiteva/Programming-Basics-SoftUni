
import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poorGradeLimit = Integer.parseInt(scanner.nextLine());
        int poorGradeCount = 0;
        int problemCount = 0;
        double gradesSum = 0;
        String lastProblemName = "";
        String problemName = "";
        double grade = 0;

        while (true){
            problemName = scanner.nextLine();
            if(problemName.equals("Enough")){
                break;
            }
            grade = Double.parseDouble(scanner.nextLine());
            gradesSum += grade;
            lastProblemName = problemName;
            problemCount++;

            if (grade <= 4){
                poorGradeCount++;
                if(poorGradeCount >= poorGradeLimit){
                    break;
                }
            }
        }

        if (poorGradeCount < poorGradeLimit){
            System.out.printf("Average score: %.2f%n", gradesSum / problemCount);
            System.out.printf("Number of problems: %d%n", problemCount);
            System.out.printf("Last problem: %s%n", lastProblemName);
        }else {
            System.out.printf("You need a break, %d poor grades.", poorGradeCount);
        }
    }
}