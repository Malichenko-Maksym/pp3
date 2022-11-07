import java.util.Arrays;
import java.util.Random; 
import java.util.Scanner;
public class StudentGrades {

    String studentName;
    double[] grades;
    Random random = new Random(); 
    Scanner input = new Scanner(System.in);  

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
        
    }

    StudentGrades(String name, int numberOfGrades){
        this.studentName = name;
        this.grades = new double[numberOfGrades];
        for (int g_number=0; g_number<grades.length; g_number++ ) {
            this.grades[g_number] = 2+ random.nextInt(4)+random.nextInt(2)*0.5; 
        }
    }

    StudentGrades(String name) {
        
        System.out.print("Enter the number of elements you want to store: ");  
        int n=input.nextInt();
        this.grades = new double[n];  
        System.out.println("Enter the elements of the array(use `,` to separete decimal part): ");  
        for(int g_number=0; g_number<n; g_number++)  { 
            this.grades[g_number]=input.nextDouble();  
        }  
    }

    public double lowestGrade(){
        double min = grades[0];
        for (int g_number=1; g_number<grades.length; g_number++ ) {
            if (grades[g_number]<min){
                min = grades[g_number];
            } 
        }
        return min;
    }

    public double highestGrade(){
        double max = grades[0];
        for (int g_number=1; g_number<grades.length; g_number++ ) {
            if (grades[g_number]>max){
                max = grades[g_number];
            } 
        }
        return max;
    }

    public int numberOfGrades(){
        return grades.length;
    }

    public double gradeAverage() {
        double sum = 0;
        for (int g_number=0; g_number<grades.length; g_number++ ) {
            sum+=grades[g_number];
        }
        return sum/numberOfGrades();
    }

    public void showStudentInformation(){
        System.out.println(studentName+": "+Arrays.toString(grades)+" Number of grades: "+numberOfGrades()+" lowest: "+lowestGrade()+" greatest: "+highestGrade());
        System.out.println("Average: "+gradeAverage());
    }

    public static void main(String[] args) {
        double[] s1Grades = {3.5, 4.5, 4.0};
        StudentGrades s1 = new StudentGrades ("Amanda",  s1Grades );
        StudentGrades s2 = new StudentGrades ("James");
        s2.showStudentInformation();
        s1.showStudentInformation();
    }
}
