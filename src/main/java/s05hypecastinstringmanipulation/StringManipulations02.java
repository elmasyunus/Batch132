package s05hypecastinstringmanipulation;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Ex.1: s String'inin money ile bitip bitmedigini kontrol edin
        boolean isEnd = s.endsWith("money");
        System.out.println((isEnd));

        //Ex.2 "s" String indeki money kelimesii dollar kelimesine ceviriniz
        String s1 = s.replace("money", "dollar");
        System.out.println(s1);

        //Ex.3: s String indeki ean kelimesini win kelimesini ceviriniz
        String s2 = s.replace("earn", "win");
        System.out.println(s2);// Lwin Java win money

        //Ex.4: s String indeki a harflerini "*" kelimesine ceviriniz
        //Replace method unda coklu karakter ile calisirsaniy cift tirnaga mecbursunuz ama tek karakterle calisirsaniz
        // cift tirnak veya tek tirnak kullanabilirsiniz. Ama ikisi de tek veya cift tirnak olmalidir

        String s3 = s.replace("a", "*");
        System.out.println(s3);

        //Ex.5 s String indeki n harflerini "xxx" a ceviriniz
        String s4 = s. replace("n", "xxx");
        System.out.println(s4);

        //Ex.6: s String indeki tum e harflerini siliniz
        //Hicbir sey char data type inda yoktur, bu yuzden replace() method unu kullanarak silme islemi aparsaniz
        //mutlaka cift tirnak kullaniniz
        String s5 = s.replace("e", "");
        System.out.println(s5);

        String t = "Ali 13 yasindadir!...";
        //Ex.7: t String indeki tum rakamlari * a ceviriniz.
        //Bir grup datayi degistirmek isterseniz replacAll() kullnilir.
        //mote: Bir grup data yi ifade etmek icin "Regular Expressions"(Regex) kullaniriz.
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(1);

        /*
        Meshur Regex ler
        1- Tum rakamlar ===> [0-9]
        2- Tum kucuk harfler ==> [a-z]
        3- Tum buyuk harfler ==> [A-Z]
        4- Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
        5- Tum harfler ve rakamlar ==> [a-zA-Z0-9]
        6- Tum noktalama isaretleri ==> //p{Punkt}
        7- Tum sesli harfler ==> [aeiouAEIOU]
           x,q,w harfleri ==> [xqw]
        8- Kucuk harflerden farkli tum char ler ==> [^a-z]
        9- Tum harflerden farkli tum char lar ==< [^a-zA-Z]
         */

        //Ex.8: t String indeki tu mrakamlari ve harfleri ! e ceviriniz
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);// !!! !! !!!!!!!...

        //Ex. 9: t String indeki tum rakamlari ve harfleri ! e ceviiniz
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);//Al? 13 y?s?nd?r!...

        //Ex.10: t Str kucuk harfler disindaki tum char lari <> ceviriniz
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);

        //Ex.11: t String indeki tum harfler disindaki tum char lari + ceviriniz
        String t5 = t.replaceAll("[^a-zA-Z]", "t");
        System.out.println(t5);

        //Ex.12: t String indeki space ler dis tum char lari $ ceviriniz


        //Ex.13: t String indeki sesli harfler disindaki tum char lari & ceviriniz
       String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);






    }
}
