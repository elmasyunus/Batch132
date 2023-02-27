package s09incrementdecrementternaryswitch;

public class NestedTernary01 {
    public static void main(String[] args) {
        //Ex.1: VERILEN YILIN "ARTIK YIL"(LEAP YEAR) OLUP OLMADIGINI KONTROL EDEN KODU YAZINIZ.
        //1) Yil 100e bolunurse 400e de bolunmelidir. 1600==>Leap Year 1800==>Leap degil
        //Yil 100e bolunmuyorsa 4 e bolunmelidir. 2004==>Leap 2005==>Leap degil
        int year = 2005;
        String result = year % 100==0 ? (year%400==0 ? "Leap" : "Not Leap") : (year%4==0 ? "Leap" : "Not Leap");

        System.out.println(result);


    }
}
