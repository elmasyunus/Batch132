package s04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {
    public static void main(String[] args) {
    //prim :            char     -  boolean - byte - int  -  long   -  long - flost - double
    // Wrapper Class : Character - Boolean - Byte - Short - Integer - Long - Float - Double

    int n = 12;// "n" yazip nokta koyarsaniz hic method goremezsiniz, cunku "prim" ler method icermez.

    Integer m = 12; // "m" yazip "nokta" koyarsaniz bir cok method gorursunuz, cunku "wrapper class" lar method icermez.
    // parantezli olunca method oluyor. non prim ler memory de cok yer kaplar, o nedenle wrapler hep kullanilmaz.

        byte p  = 23;
        Byte r = 43;

        //Example 1: short data type inin min ve max degerlerini kod yazarak bulunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        //Example 2: int min ile byte max i bulunuz.
        int intMin = Integer.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println(("Toplam:" + (intMin + byteMax)));

        //Ex3: prim int i wrapper int e ceviriniz
        int num = 22;

        Integer wrapperNum = num;
        System.out.println(wrapperNum);

        //Wrapper byte prim byte a cevir

        Byte k = 43;
        byte primK = k;

        System.out.println(primK);

        //Ex-4: i) Prim char i Wrapper Char a ceviriniz.(Autoboxing)
        char initial = 'T';

        Character initialWrapper = initial;

        // ii)Wrapper boolean'i prim boolen'a eviriniz. (Unboxing)
        Boolean is0ld = true;
        boolean is0ldWrapper = is0ld;

        //Ex.5: Size String olarak  veerilen iki fiyatin toplamini ekrana yazdiriniz.
        String shirt = "2300";
        String shoes = "5200";

        //Java da + sembolu iki sayi arasinda kullanilirsa toplama islemi olur
        // iki string veya bir string bir sayi arasinda kullanilirsa "concatenation islemi" olur.
        // concatenation birlestirme islemi yapar
        // Note: natenatikteki islem onceligi
        // Once uslu, parantey ici, carpma ve bolme, toplama ve cikarma
        System.out.println(shirt+shoes);

        int toplamFiyat = Integer.valueOf(shirt) + Integer.valueOf(shoes);

        System.out.println(toplamFiyat);

        //ex.6 String ol. verilen iki fiyatin toplamini ekrana yazdiriniz
        String tv = "$11000";
        String radio = "$3000";

        System.out.println(tv + radio);
        //valueOf sadece rakamlarda kull.. Rakam olmayan bir karakter koyarsaniz hata verir.




    }
}
