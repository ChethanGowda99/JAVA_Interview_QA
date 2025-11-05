package part_1.p1_IfElseNestedIf_Programs;

public class p3_StudentGradeMarks
{
    public static void main(String[] args) {
        int marks = 82;  // Example input
        char grade;
        if (marks >= 90) {
            grade = 'A';
        }
        else if (marks >= 80) {
            grade = 'B';
        }
        else if (marks >= 70) {
            grade = 'C';
        }
        else if (marks >= 60) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }

        System.out.println("Marks: " + marks + " => Grade: " + grade);
    }
}

