package day10switchloops;

public class Loop02 {
    public static void main(String[] args) {
        //21 den 180 e kadar hem 4 hem 6 ile bolunebilen tamsayilari ekrana yazdiran kodu yaziniz.
        for (int i =21; i<181; i++){
            if (i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
            //ex.:Size verilen kucuk harfle yazilmis String in index i cift sayi olan character lerini buyuk harf yapin
            //  ankara ==>AnKaRa
            //Her senaryo icin calismayan ozel durumlar icin calisan koda 'hard code' denir. Hard code tercih edilmez
            //Length character sayisini verir. Ör. Ankara nin lengthi 6, indexi 5 tir. Son index lengthin 1 eksigidir.
            //Bu kural hic degismez. Bir String de son index = length() -1
            String s = "ankara";
            for (int f=0;   f<s.length(); i++){
                String ch = s.substring(i, i+1);

                if (i%2==0){
                    System.out.println(ch.toUpperCase());


                }

            }

        }



    }
}
