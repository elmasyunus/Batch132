package s03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin iki kenar uyunlugunu aliniz
        //Alanini hesaplayiniz
        //Cevresini hesaplayiniz

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz");
        float shortSide = input.nextFloat();

        System.out.println("Dikdortgenin uzun kenar uzunlugunu giriniz");
        float longSide = input.nextFloat();

        System.out.println(shortSide * longSide);

        System.out.println("Cevre = " + (2*shortSide + 2*longSide));
    }
}
