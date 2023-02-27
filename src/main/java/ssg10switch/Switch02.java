package ssg10switch;


import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {



        // get the month name  from the user
        // write a program that prints the desired month is the number of months

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter month name");
        String monthName=scan.next();



        if (monthName.equals("January")) {
            System.out.println(1);
        } else if (monthName.equals("February")) {
            System.out.println(2);
        }else if (monthName.equals("March")) {
            System.out.println(3);
        }else if (monthName.equals("April")) {
            System.out.println(4);
        }else if (monthName.equals("May")) {
            System.out.println(5);
        }else if (monthName.equals("June")) {
            System.out.println(6);
        }else if (monthName.equals("July")) {
            System.out.println(7);
        }else if (monthName.equals("Augstos")) {
            System.out.println(8);
        }else if (monthName.equals("September")) {
            System.out.println(9);
        }else if (monthName.equals("October")) {
            System.out.println(10);
        }else if (monthName.equals("November")) {
            System.out.println(11);
        }else if (monthName.equals("December")) {
            System.out.println(12);
        }else {
            System.out.println("Please enter a valid month name");
        }
    }
}
