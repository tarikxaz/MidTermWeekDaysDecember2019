package problemandsolutions;

import java.util.Scanner;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade is B.


    public static void main(String[] args) {

        double quiz, mid_term, final_term, score;

        Scanner sn=new Scanner(System.in);
        System.out.println("enter score if quiz:");
        quiz=sn.nextDouble();
        System.out.println("enter score of mid_term:");
        mid_term=sn.nextDouble();
        System.out.println("enter score of final_term");
        final_term=sn.nextDouble();

        score=(quiz+mid_term+final_term)/3;
        if(score>=90) {
            System.out.println("your grade is A");
        }
        else if (score>=70) {
            System.out.println("your grade is B");

        } else if (score>=50) {
            System.out.println("your grade is C");

        }
        else {
            System.out.println("your grade is F");
        }
    }

}
