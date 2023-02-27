package s03scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli
        //bir sayinin ilk iki ve son iki basamagindaki rakamlarin toplamini yazdiran kodu yaziniz
        //Note: Bir sayinin sin rakamini alabilmek icin o sayiyi 10 a bolun kalana bakin
        //Note: Bir tamsayiyi bir tamsayiya bolerseniy Java sonucu kesinlikle tam sayi yapar.
        //Java sonucu tamsayi yapmak icin ondalik kismi iptal eder.

        Scanner input = new Scanner(System.in);

        System.out.println("5 basamakli bir sayi giriniz...");

        int number = input.nextInt();

        //Son rakami al
        int lastDigit = number%10;
        number = number/10;

        //sondan ikinci rakami al
        int lastSecondDigit = number%10;
        number = number/10;

        //sondan ucuncu rakami al
        int lastThirdDigit = number%10;
        number = number/10;

        //sondan dorduncu rakami al
        int lastFourthDigit = number%10;
        number = number/10;

        //sondan besinci rakami al
        int lastFifthDigit = number%10;
        number = number/10;

        //Sayiyi kucult
        number = number/10;

        System.out.println(lastDigit + lastSecondDigit + lastFourthDigit + lastFifthDigit);
    }
}
