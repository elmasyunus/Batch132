package s07ifstatemnets;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        //Ex.1: verilen karakter buyukse 'Buyuk Harf' yazdiran, kucukse kucuk harf yazdiran kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Char giriniz");
        char ch = input.next().charAt(0);
        if (ch>= 'A' && ch<= 'Z'){
            System.out.println("Buyuk Harf...");
        //Char. kullanirken ASCII den sembol almak yerine buyuk esit kullanabilirsiniz.
        }
        if (ch>='a' && ch<='z') {
            System.out.println("Kucuk Harf");
//
//            //2.Yol:
            if (ch >= 'A' && ch <= 'Z') {

            }
            System.out.println("Buyuk Harf...");
        }else if(ch>='a' && ch<='z'){
            System.out.println("Kucuk Harf...");

        }else{
            System.out.println("Harf Degil...");
        }


    }
}
