package s03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("iki sayi giriniz");

        double firstNumber = input.nextDouble();

        double secondNumebr = input.nextDouble();

        System.out.println(firstNumber+secondNumebr);

        System.out.println(firstNumber-secondNumebr);

        System.out.println(firstNumber * secondNumebr);

        System.out.println(firstNumber / secondNumebr );


    }
}
