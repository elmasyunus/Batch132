package s05hypecastinstringmanipulation;

public class StringManipulation {
    public static void main(String[] args) {
        //String bir non prim dir ayni yamanda bir class tir. Iki vasif...

        String s = "Java is esay";

        //Ex 1: "s" deki tum karakterleri buyuk harf yapin
        String sUpper = s.toUpperCase();
        System.out.println(sUpper);

        //Ex 2: "s" deki tum karakterleri kucuk harf yapin
        String sLower = s.toLowerCase();
        System.out.println(sLower);

        //Ex 3: "s" String"indeki ilk character"leri aliniz.
        //index 0 dan baslar.
        char firstChar = s.charAt(0);
        System.out.println(firstChar);

        //Ex.4: "s" String deki ikinci ve sondan ikinci char i aliniz ve ekrana yanyana yazdiriniz.

        char secondChar = s.charAt(1);//a
        char secondLastChar = s.charAt(10);//s

        //1.yol: Ayni satirda yazdirmak icin
        System.out.println(secondChar);
        System.out.println(secondLastChar);

        //2.yol: Ayni satirda yazdirmak icin
        System.out.println("" + secondChar + secondLastChar);


        //Ex.4: "s" String de kullanilan char sayisini bulunuz
        int sLength = s.length();
        System.out.println(sLength);//12
        //harfleri sayrken 1 den indexleme yaparken 0 dan.

        //ex.6 "s" String indeki ilk 4 char i aliniz.
        //Ilk index yani 0 ve ikincisinin bir sonrasi yazilir paranteze

        String sub1 = s.substring(0,4);
        System.out.println(sub1);

        //Ex.7 "s" String deki is kelimesini aliniz.
        String sub2 = s.substring(5,7);
        System.out.println(sub2);

        //Ex.8: "s" String indeki "easy" kelimesini aliniz.
        String sub3 = s.substring(8,12);
        System.out.println(sub3);

        //bir char.dan baslayip String in sonuna kadar almak isterseniz, ikinci index i yazmaya gerek yok.
        //s.substring(8,12) yerine s.substringg(8); yaziniz.
        String sub4 = s.substring(8);
        System.out.println(sub4);

        //Ex.9: s String inde "money" kelimesinin olup olmadigini kontrol ediniz.

        boolean isExist = s.contains("");
        System.out.println(isExist);

        /*
        Bir method u ogrenirken 3 seyi mutlaka ogrenin
        1 bu method ne is yapar?
        2. bu method un farkl ikullnimlari nasildir?
        3. bu method size ne return eder?

         */

        //Ex. 10: "s" String inin belli bir harfle baslayip baslamdigini kontrol ediniz.
        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //Ex.11 : s String inin 6. char dan itibaren belli bir harfle baslayip baslamadigini kontrol ediniz
        //Char deniyorsa 1 den baslanacak.
       boolean isBegin = s.startsWith("i", 5);
        System.out.println(isBegin);



    }
}
