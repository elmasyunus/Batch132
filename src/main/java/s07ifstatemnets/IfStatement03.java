package s07ifstatemnets;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {
        //Ex.3: verilen bir sayinin poy, neg vea notr old. kontrol eden kodu giriniz
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz...");
        int num = input.nextInt();

        if (num>0){
            System.out.println("Pozitif...");

        } else if (num<0){
            System.out.println("Negatif...");


        }else{
            System.out.println("notr");
        }
    }
}
