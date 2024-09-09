import java.util.Scanner;

public class studentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        int engMarks = getValidMarks(sc, "Enter the English marks (1-100): ");
        int sciMarks = getValidMarks(sc, "Enter the Science marks (1-100): ");
        int mathMarks = getValidMarks(sc, "Enter the Math marks (1-100): ");

        int tot = engMarks + sciMarks + mathMarks;
        float avg = (tot / 300.0f) * 100;

       
        System.out.println("TOTAL MARKS = " + tot);
        System.out.println("AVERAGE PERCENTAGE = " + String.format("%.2f", avg) + "%");

        
        if (avg > 90) {
            System.out.println("Your grade: Outstanding");
        } else if (avg > 80) {
            System.out.println("Your grade: A");
        } else if (avg > 70) {
            System.out.println("Your grade: B");
        } else if (avg >= 60) {
            System.out.println("Your grade: C");
        } 
        else if(avg >35) {
        	System.out.println(" your grade: D");
        }
        else {
        	System.out.println("Better luck next time you are Fail");
            System.out.println("Your grade: Fail");
        }

        sc.close();
    }

    private static int getValidMarks(Scanner sc, String prompt) {
        int marks;
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                marks = sc.nextInt();
                if (marks >= 1 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Marks should be between 1 and 100. Please enter again.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); 
            }
        }
        return marks;
    }
}
