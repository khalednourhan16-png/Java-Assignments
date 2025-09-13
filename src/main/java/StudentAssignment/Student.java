package StudentAssignment;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Student {public static void main(String[] args){


     int studentNum=3;
     int subjectNum=3;
     String Name="studentName";
     int ID=1000;
     double grade=0;


     Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the student Name");
        String studentName=scanner.nextLine();

        System.out.println(" Enter the student ID");
        int studentID=scanner.nextInt();

        boolean again=false;

        for( int i=0;i<studentNum;i++)

    {
        int total = 0;

        for (int j = 0; j < subjectNum; j++) {
            System.out.println("Enter score for course "  + (j + 1) +  " for Student "  + studentName);
            double score = scanner.nextDouble();
            total += score;

        }
        double avg = total / subjectNum;
        System.out.println("The average score of student "  + studentName + " is "  + avg);

        double studentStatus= avg;
        if(avg>=50)
            System.out.println("The student " + studentName + " is : passed");
        else
            System.out.println("The student " + studentName + " is: Failed");


        if (again==false)
            System.out.println("Good bye !");
          break;
    }

    }

}