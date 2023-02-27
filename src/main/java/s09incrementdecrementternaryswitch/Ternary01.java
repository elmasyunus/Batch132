package s09incrementdecrementternaryswitch;

public class Ternary01 {
    public static void main(String[] args) {
       //Ex.1: Kodu once oku sonra kodu yazdir. Once anla...
        int a = 10;//Bu bir variable
        int b = 20;
        int r1= a<b ? a++ : ++b;
        System.out.println(r1);//10
        System.out.println(a);//11
        System.out.println(b);//20

        //Ex 2: verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //  -4 ==> -1*-4    4 ==> 4 0 ==>0

        int c =-4;
        int r2 = c<0 ? -1*c : c;//Ternary sarti yaz, soru isareti koy...
        System.out.println(r2);//4

        //Ex 3:Iki sayiniin isareti ayniysa bunlari carpan, isaretleri farkli ise "Farkli isaretli sayilari carpa-
        //miyorum" mesaji veren kodu yaziniz.

        int m = 5;
        int n = -6;
        Object r3 = (m>0&& n>0) || (m<0 && n<0) ? m*n : "Farkli isaretli sayilari carpamiyorum";//Onject bir data type.
        //object Java da parent i olmayan tek data type(class) dir. Ama object tum Non-Primitive data type(class) larin ortak parentidir.
        //Object ile farkli data typelar calisitririlabilir. Java da Object insanlik aleminde Hz. Adem e benzer.
        //Buyuk harfle baslayanlar Non-Prim dir. non-Prim ler hafizada ayni yeri kaplar.
        System.out.println(r3);

        //Ex.3: Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz.
        int f = -343;
        int r = Math.abs(f);
       String r4 = r>99 && r<1000 ? f + "uc basamaklidir" : f + "Lutfen 3 basamakli bir sayi yaziniz.";//Bu tarz cikti-
        //lar dinamik ciktilardir.
        //Sarti kontrol ederken r yi kullandik, ciktilar icin f yi kullandik.
        System.out.println(r4);






    }
}
