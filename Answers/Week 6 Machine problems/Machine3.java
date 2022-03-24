import java.util.Scanner;

public class Machine3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        
        System.out.print("Enter the number of students: ");
        int numStudents = in.nextInt();
        
        if (numStudents <= 0){
            System.out.println("Number of students cannot be less than 1");
            return;
        }
        
        double[] grades;
        grades = new double[numStudents];
        double sum = 0;
        double max = grades[0];
        double min = grades[0] + 100;
        int i = 0;

        while (i < numStudents){
            System.out.printf("Enter the grade for student %1$d: ", (i+1));
            int grade = in.nextInt();

            if (grade >= 0 && grade < 100){
                grades[i] = grade;
                sum = sum + grade;
                i++;
            } else {
                System.out.println("Grade must be between 0 and 100");
            }
        }
        
        for (double x : grades){
            if (x > max){
                max = x;
            }
        }

        for (double x : grades){
            if (x < min){
                min = x;
            }
        }
        
        double avg = sum / numStudents;
        System.out.println("The average is: " + String.format("%.2f",avg));
        System.out.println("The maximum is: " + (int)max);
        System.out.println("The minimum is: " + (int)min);
    }
}