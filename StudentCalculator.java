import java.util.*;
class StudentCalculator{
    public static void main(String[] args){
        double s = 0;
        System.out.println("Enter Number of subjects: ");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        for(int i=1;i<n+1;i++){
            System.out.println("Enter the marks obtained out of 100 in Subject "+i+": ");
            double m = sc.nextInt();
            s = s + m;
        }
        System.out.println("Total marks: "+s);
        double averagePercentage = s/n;
        System.out.println("Average Percentage: "+averagePercentage);
        String grade;
        if(averagePercentage >= 90){
            grade = "S";
        }
        else if(averagePercentage >= 80){
            grade = "A";
        }
        else if(averagePercentage >= 70){
            grade = "B";
        }
        else if(averagePercentage >= 60){
            grade = "C";
        }
        else if(averagePercentage >= 50){
            grade = "D";
        }
        else if(averagePercentage >= 40){
            grade = "E";
        }
        else{
            grade = "F";
        }
        System.out.println("Grade: "+grade);
    }
}