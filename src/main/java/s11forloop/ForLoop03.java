package s11forloop;

public class ForLoop03 {
    public static void main(String[] args) {
        //Ex.1: Size verilen bir String i tersten yazdiriniz
        // "Germany" ==> ynamreG

        String s = "Germany";

        String t = "";

        for (int i=s.length()-1; i>=0; i--){
            t = t + s.charAt(i);

        }

        System.out.println(t);
        //bu soruyu kendin yazabiliyor ve anlatabiliyor olman lazim...interviewluk soru
        //Yazdirmayi loop un disina koyarsan t nin en son halini görürsün. Adim adim görmek istersen loop un icine
        //yazdirabilirsin.

        //Ex.2: Size verilen bir String in "Palindrome" olup olmadigini kontrol eden kodu yaziniz.
        // civic nalan, kucuk, 11211
        //Logic: Soru verilince önce mantigini düsün. Interview da sesli düsün.Mantigini bilip bilmedigine bakarlar.
        //Hep topu kendi sahanda tut, soruya mahal kalmasin.
        //Bu soruda String i ters cevir sonra da duz hali ile ters halini karsilastir, ayniysa "Poálindrome" de.

        String duz = "civic";
        String ters = "";
        for (int i=duz.length()-1; i>=0; i--){
            ters = ters + duz.charAt(i);

        }
        if (duz.equalsIgnoreCase(ters)){
            System.out.println(duz + " : Palindrome'dur");
        }else{
            System.out.println(duz + " Palindrome degildir");
        }



    }
}
