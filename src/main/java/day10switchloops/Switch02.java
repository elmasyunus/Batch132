package day10switchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        //Ex1: Kullanicidan iki sayi ve yapilacak islemi alan ve +,-+*,/,% lsmelerini yapan kodu yaziniz.
        Scanner input = new Scanner(System.in);

        System.out.println("Iki sayi giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println("Yapilacak islemi giriniz. +,-,*,/,% dan birini seciniz...");
        //Tek karakter oldugu icin char kullaniyoruz. String de kullanilabilir ama String non prim old. icin memory de
        //daha fazla yer kaplar.
        char opr = input.next().charAt(0);
        switch (opr){
            case '+':
                System.out.println(a+"+" + b + "=" + (a+b));
                break;
            case '-':
                System.out.println(a+"-"+b+ "="+ (a-b));
                break;
            case '*':
                System.out.println(a+"*"+b+ "="+ (a*b));
                break;
            case '/':
                System.out.println(a+"/"+ b + "=" + (a/b));
                break;
            case '%':
                System.out.println(a+"%"+ b+ "="+ (a%b));
                break;
            default:
                System.out.println("bu islem tanimlanmamistir...");
        }


    }
}
