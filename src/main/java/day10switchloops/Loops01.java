package day10switchloops;

public class Loops01 {
    public static void main(String[] args) {
        //Ex1: Ekrana 5 kere "Hi" yazdiriniz.
        /* Code Standarts
        i)Tekrar(Repetition) olmamalidir.
        ii)Dynamic olmalidir.
        iii)Tamir(Fix) ve update kolay yapilabilmelidir.
          */

        //1.Yol:Tavsiye edilmez.
        System.out.println("Hi");

        //2.Yol:
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde Loop lar kullanilir.
        //Dort tane loop var; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //i)for-loop. //for-loop da cogu yaman i kullanilir.
        //Baslangic degeri Loop un calisma sarti Increment/Decrement
        for (int i=1 ; i<6 ; i++ ){
            System.out.println("Hi");
        }
     //Ex.1: 11 den 44 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for(int i=11; i<45; i++){
            System.out.println(i);
        }
        //Ex.3:40"dan 23'e kadar tüm cift tamsayilari ekrana yazdiran kodu yaziniz.
        for (int i=40; i>22; i--){
            if (i%2==0){
                System.out.println(i);
            }

        }
        //Ex.4:18'den 56'ya kadar tum tek sayilari ekrana yazdiran kodu yaziniz.
        for (int i=18; i<57; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }


    }
}
