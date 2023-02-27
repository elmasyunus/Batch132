package s05hypecastinstringmanipulation;

public class Typecasting01 {
    /*
    Numeric prim. data type larin birbirine donusturulmesine Type Casting denri.
    Numeric ler: byte short int long float double

    Note1: kucuk data t lari buyuge donusturmeyi Java otomatik olarak yapabilir. Buna autowidening denir.
    Note2: Buyuk data type larini kucuk data t ye cevirmeyi Java otomatik yapmaz. Risk almaz. Bunu kodcular yapar.
    Buna ExplicitNarrowing denir.

     */

    public static void main(String[] args) {
        //byte i int e
        byte age = 13;
        int ageInt = age;//AutoWidening

        //long u short a cevirelim
        long weight = 234;
        short weightInt = (short)weight;//ExplicxitNarrowing

        //int i float a
        int population = 700000;
        System.out.println(population);
        float populationFloat = population;
        System.out.println(populationFloat);

        //double i short a cevir

        double number =12.934;
        System.out.println(number);

        short numberShort = (short)number;
        System.out.println(numberShort);

        //Dikkat!
        //Donusum yaptiginiy sayi(260), donustureceginiz data type in sinirlarinin disindaysa#
        short num = 260;
        System.out.println(num);

        byte numByte = (byte)num;
        System.out.println(numByte);

        //Ex 2:
        //Eski app ler legacy dir.
        short n = 1023;
        System.out.println(n);

        byte nByte = (byte)n;
        System.out.println(nByte); //-1

    }








}




