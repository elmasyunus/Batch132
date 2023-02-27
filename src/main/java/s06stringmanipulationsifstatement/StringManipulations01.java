package s06stringmanipulationsifstatement;

public class StringManipulations01 {
    public static void main(String[] args) {
        //Ex.1: Bir String in bas ve sonunda space character i varsa siliniz.
        String s = "    Ali Can     ";
        System.out.println(s);
        //Trim metodu bastaki ve sondaki space char lari siler aradakilere dokunmaz. Ortadakileri replace ile silersin.

        //Ex.2: Fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        // String tv = "$456.99"; String laptop = $875.99
        String tv1 = "$456.99";
        String laptop = "$875.99";

        String tv2 = tv1.replace("$", "");
        System.out.println(tv2);//ondalik sayilar Java da otomatik olarak double kabul edilir.

        String laptop1 = "$875.99";
        String laptop2 = laptop1.replace("$", "");
        //Kesme isareti icindeki sayilar String gibi oluyor. Sayi icin int veya double a degistiriyoruz.

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println(totalPrice);

        //Float i bilin ama kullanmayin. Cunku sonuna f koymak gerkeiyor. Virgullu gorunce double dan yuru.

        //Ex.3: verilen ismin ilk isminin ilk harfini ve soy isminin son harfini ekrana yazdiriniz.
        //ilk harflerini almak ABD de yaygin. "Ali Can" ==> AC
        String name = "   ali caN   ";
        //BASTAKI VE SONDAKI SPACE LERI TRIM ILE SILIYORUZ.
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(second);

        //Ex.4: Bir String in hic karakter icermedigini kontrol eden kodu yaziniz.
        String str = "";

        //1.yol: length() kullan
        boolean result1 = str.length() == 0;
        System.out.println("String bos mu?" + result1);//true

        //2.Yol:
        //Ilk soracaginiz yer google'dir, sirkette de boyle. ikinci olarak ayni isi yapanlara sorun.
        boolean result2 = str.isEmpty();
        System.out.println(result2);
        //Java bir is icin metot uretmisse onu kullanmak oncelikli. Az is icin de isEmpty yolu daha iyidir.

        //Ex.5: String in space disinda karakter icrmedigini kontrol et
        String t = "";

        //      1. Yol:
        boolean result3 = tv1.replace(" ", "").length() == 0;
        System.out.println(result3);

        // 2. Yol:
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println(result4);

        // 3.Yol:
        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var? " + result5);
        //isBlank() methodu sadece space iceren String ler icin true verir, space disinda bir char varsa false verir.
        //isBlank methodu bos String ler icin de true verir. Yani isBlank isEmpty yi icinde barindirir.
        //isblank space + hicbir sey icin true verir. isEmpty sadece hicbir sey icin true verir.

        //Ex.6: Bir String de a,e,i karakterlerlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        // java is easy to learn
        String r = "Java is easy to learn";
        int idxA = r.indexOf("a");
        int idxI = r.indexOf("i");
        int idxE = r.indexOf("e");

        System.out.println("Indexler topllami:" + (idxA + idxE + idxI));

        //Ex.7: bir String de java kelimesinin kacinci index de kull. gosteren kodu yaziniz.
        //      Ah Java  vah Java sensiz olmuyor java.

        String u = "Ah Java vah Java sensiz olmuyor java.";
        //indexOf("Java") kullaniminda siz Java kelimesinin ilk gorunumundeki ilk harfin(Yani j nin) index ini almis
        //olursunuz.
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);
        //indexOf method u olmayan char lar icin -1 verir.
        int idxOfXyz = u.indexOf("xyz");
        System.out.println("indOfxyz");

        //Ex.8: Bir String de a,i,e char larinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //  "java is easy to learn" ==> 18+5+17=40

        String v = "Java is easy to learn";
        int idxOfA = v.lastIndexOf('a');//V string ine git a nin son indexini al.
        System.out.println(idxOfA);//18

        int idxOfI = v.lastIndexOf("i");
        System.out.println(idxOfI);

        int idxOfE = v.lastIndexOf("e");
        System.out.println(idxOfE);
        //lastindexOd String de olmayan bir char icin kullanilirsa her zaman -1 olur.

        //Ex.9: Bir Strimg deki tekrarsiy karakterleri ekrana yazdiriniz.
        // abbcccdc ==>
        //Note: BAZI KODLARIN BAZI SARTLARA BAGLI OLARAK CALISMASI GEREKIR.
        //Bazi kodlari bazi sartlara göre aktivite etmek icin 'if statement' kullanilir.
        /// if you study hard, you will learn java
        String y = "aac";
        char ch1 = y.charAt(0);
        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }
        char ch2 = y.charAt(1);
        if (y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }
        char ch3 = y.charAt(2);
        if (y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }
        //Ex. 10: Sayi cift ise ekrana cift yazdirin.
        int num = 12;

            System.out.println("Pozitif");
        }

        //Ex. 12: Sayi 3 basamakli ise ekrana Wooow! yazdirin.
    int n = 123;

    }





