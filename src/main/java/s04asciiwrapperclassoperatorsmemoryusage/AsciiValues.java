package s04asciiwrapperclassoperatorsmemoryusage;

public class AsciiValues {
    public static void main(String[] args) {
        //java da her karakterin bir sayisal degeri vardir. Bunlara ascii degerler denir. Bu degerlerin oldugu tabloya
        //ASCII Table denir
        //Herhangi bir karakterin ASCII degerini bulmak icin o karakteri int data type inda bir variable in icine koyunuz.
         int ch = 'A';
        System.out.println(ch);

        int unlem = '!';
        System.out.println(unlem);

        char c1 = 'K';
        char c2 = '?';
        //java da char'lari matematiksel islemlerde kullanirsaniz, Java o char'larin ASCII degerlerini kullanir.
        System.out.println(c1+c1);
    }
}
