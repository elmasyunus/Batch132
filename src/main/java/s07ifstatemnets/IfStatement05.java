package s07ifstatemnets;

import java.util.Scanner;

public class IfStatement05 {
    public static void main(String[] args) {
        /*Ex.1:Ay isimlerini girilince kacinci ay yazan kodu giriniz.
        Stringlerin esitliklerini kontrol ederken == isareti yerine equals() kullaniriz.
        Cunku == sembolu iki Strin g i karsilastirirken hem adreslerine hem degerlerine bakar, ikisi de ayni ise
        size String ler esittir der. Ama biz kof yazarken genellikle String lerin adresleri ile degil degerleriyle
        ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz.
        "equals" method u ise iki String"i karsilastirirken sadece drgerlerine bakar, degerler ayni ise bu iki String
        esittir der, degerler farkli ise farklidir der ki bu bizim kod yazarken ihtiyac duydugumuz seydir.*/
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen ay ismini giriniz...");
        String monthName = input.next();
        if(monthName.equalsIgnoreCase("january")){
            System.out.println(1);
        } else if (monthName.equalsIgnoreCase("February")) {
            System.out.println(2);

        }else{
            System.out.println("invalid month name...");

        }
        String s = "Tom";
        String t = "Terry";
        String r = new String("Tom");
        String m = "Tom";

        System.out.println(s==t);//false cunku; adresler ve degerler farkli
        System.out.println(s.equals(t));//false cunku; degerler farkli
        System.out.println(s==r);//false cunku adresler farkli, new yeni bir String uretir ve adresi farkli olur.
        System.out.println(s.equals(r));//true cunku equals() sadece degerlere bakar.
        System.out.println(s==m);//true verir. Cunku isimler ayni olunca java yer tasarrufu icin Heap de ikisini de ayni
        //memory ye koyar ve Stack de de ayni adrese koyar.
        System.out.println(s.equals(m));//bunda hayli hayli true verir. Cunku hem degerler hem adresler ayni.
        //Esas olan java nin mantigini ogrenmektir, arkada neler yaptigini ogrenmektir.



    }
}
