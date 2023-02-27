package ssg10switch;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //write a program to check Vowel or Consonant letters in English:

        Scanner input = new Scanner(System.in);
        System.out.println("please enter month number");

        byte monthNumber = input.nextByte();

        switch (monthNumber) {

            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Please enter valid month number...");
        }
    }
}