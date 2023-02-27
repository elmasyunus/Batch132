package s04asciiwrapperclassoperatorsmemoryusage;

public class Operator01 {
    public static void main(String[] args) {

        //note 1+ - * / math. deki gibi Java kullanilir.
        // int / int int olur
        // double i int e bolerseniz sonuc double olur. Cunku java da math. sel islemlerde farkli data type lari
        // kullanilirsa sonuc buyuk data type olur.

        //note 2: java da logical op.lar vardir.
        //AND ve OR isimleri logical op. lardir. AND isleminden true almak icin her sey true olmalidir. Perfectionist.
        //AND de bir tane false sonucu false yapar.
        //OR isleminde ikisi de false ise sonuc false olur. Bir tane true sonucu true yapar. OR "polyanna" gibidir.

        // NOT Operatory(!) true olani false, false olani true yapar.
            //!true=false, !false=true, !!true=true

        //note 3: kARSILASTIRMA op. <,>,<=,>=, ==, !=. Karsilas op kull. kesinlikle boolean(true/false) alirsiniz.
        //Java da hizli olan yavas, yavas olan hizlidir.
        // Biz AND islemi icin && kullaniriz ama & da kullanilabilir. && olursa false buldugunda digerini kotrol etmez
        // tek & koyarsan ikisini de kontrol eder ve bu nedenle yavas calisir. bu yuzden ikili & kullanilir.

        boolean first = 3<5;
        boolean second = 2+3 != 5;
        boolean third = 2+3*5>= 19;






    }
}
