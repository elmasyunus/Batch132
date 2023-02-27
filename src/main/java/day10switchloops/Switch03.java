package day10switchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        /*
        Ask user ti enter country name among "America# England# Germany# Turkey# India# peru# Spain, Bulgaria, Albania,
        France
        Type code to print abbreviation of the countries. "US, UK, DE

        */
        Scanner input = new Scanner(System.in);
        System.out.println("Ulke adini giriniz.");
        String countryName = input.nextLine();
        switch (countryName.toLowerCase()){
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            default:
                System.out.println("Tanimli bir ulke adi giriniz");

        }

    }
}
