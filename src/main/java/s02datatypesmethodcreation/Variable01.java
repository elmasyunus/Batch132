package s02datatypesmethodcreation;

public class Variable01 {

    //primitive data types --> char-boolen-byte-short-ing-long-float-double
    //float: Virgullu sayilar(ondalik Sayilar-Decimal Numbers) icin kullanilir.(Fiyatlanddirmalar icin - 12.99)
    //double: Virgullu sayilar(Ondalik sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi: 0.00000000122)

    public static void main(String[] args) {
        //Ornek 1: Gomlek ve ayakkabi fiyatlari icin iki tane variable olusturup toplam fiyati ekrana yazdiriniz.
        //Java decimal numbers i ondalik sayilari double kabul eder. Floatta israr ediyorsan F koyman lazim.
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;

        System.out.println(shirtPrice + shoesPrice);

        //1) Ali Can -----  Polinter ayni satirda-->> System.out.print()
        //2) Ali Can -----  Polinter alt satirda-->> System.out.println()
        //kisa yol: sout

        //ornek 2: hucre agirligi ve Amip in agirligi icin iki tane variable olusturun ve agirliklari farkini ekrana
        //yazdirin.
        double weightCell = 0.0000000000000112;
        double weightAmip = 0.0000000000000023;

        System.out.println(weightCell - weightAmip);

        //Developerler genelde double kullanir sonuna harf koymakla ugrasmamak icin.
        //Primitive data type larini java olusturur biy olusturmayiz.
        //Primitive data type larin isimlerinde sadece kucuk harf kullanilir.
        //Prim. data type lar memory de farkli farkli yer kaplarlar. Float 4 byte, double 8 byte yer kaplar.
        //Prim d. t. ler iclerinde sadece sizin atadiginiy degeri barindirirlar.


    }


}
