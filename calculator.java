import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Subjects: ");
        int numSubjects = sc.nextInt();

        double totalMarks = 0;

        for(int i=1; i<=numSubjects; i++){
            System.out.print("Enter marks for subject "+i+": ");
            double subjectMarks = sc.nextDouble();
            totalMarks = totalMarks + subjectMarks;
        }

        double averageMarks = totalMarks/ numSubjects;

        System.out.println("Average Marks:"+averageMarks);

        char grade;
        if(averageMarks>=90){
            grade = 'A';
        } else if (averageMarks >=80){
            grade = 'B';
        }else if (averageMarks >=60){
            grade = 'C';
        }else if (averageMarks >=50){
            grade = 'D';
        }
    }
}