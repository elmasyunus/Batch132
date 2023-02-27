package s05hypecastinstringmanipulation;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        /*
           Ex 1: Asag kurallara gore kull girdigi pass i kontrol ediniz.
           i) En az 8 karakter
           ii) Space char i olmasin
           iii) En ay bir tane buyuk harf olsun
           iiii) En az bir tane kucuk harf
           iiiii) En az bir tane sembol
           iiiiii) En az bir tane rakam

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pass giriniz...");
        String pwd = input.nextLine();

        //En az 8 char olsun
        boolean first = pwd.length()>7;
        System.out.println(first);

        //ii) Space char i olmasin
        boolean second = !pwd.contains(" ");
        System.out.println(second);

        // iii) En ay bir tane buyuk harf olsun
        //Buyuk harfolmayanlari sil kalan karakter sayisina bak. Karakter sayisi 0 ise buyuk harf yok, buyukse vardir.
        boolean third = pwd.replaceAll("[^A-Z]", "").length()>0;//Methodchain, yan yana methodlar
        System.out.println(third);

        //iiii) En az bir tane kucuk harf

        boolean fourth = pwd.replaceAll("[^a-z]", "").length()>0;
        System.out.println(fourth);

       //iiiii) En az bir tane sembol(harf ve rakam harici her sey) olsun
        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]", "").length()>0;
        System.out.println(fifth);

        //iiiiii) En az bir tane rakam olsun
        boolean sixth = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println(sixth);
        System.out.println("pass gecerli mi?" + ("first&& second && third && fourth && fifth && sixth"));

        
    }
}
