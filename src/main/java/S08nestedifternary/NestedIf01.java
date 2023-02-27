package S08nestedifternary;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        //Ex.1: Kull.dan 3 tane sayi alin ve bu 3 sayinin ucgen olusturma durumunu kontrol ediniz.
        //Eger ucgen ise eskenar ucgen olma durumunu kontrol ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz...");
        //Kullanici yanlislikla negatif sayi girdi ise kod asagidaki gibi yazilabilir.Absolute ile.
        double a = Math.abs(input.nextDouble());
        double b = Math.abs(input.nextDouble());
        double c = Math.abs(input.nextDouble());
        boolean ucgenmi =(a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && (b+c>a && a>Math.abs(b-c)));
        //kULLANICININ NEGATIF SAYI VERMESINI AFFETMIYORSAM;
        // "||" bu or isareti. Mouse u bir paranteze koyunca acilis veya kapanisini gösterir.
        //Nested if i Java da sevmez, uzun sürdügü icin(Time Consuming). Nested if son caredir. Iyi kod kisa koddur.
        //Nested if kullaninca iki uc kere dusunmek lazim; "Nested if kullanmadan kod yazilabilir mi?"
        //Parantez ici mumkun oldugu kadar sade olmalidir, karisik olmamalidir.
            if(a<0 || b>0 || c<0){
                System.out.println("Ucgenin kenarlari negatif sayi olamaz");
            }else if ((a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && (b+c>a && a>Math.abs(b-c)))){
                if (a==b && b==c && a==c){
                    System.out.println("ucgen hem de eskenar ucgen");
                }else{
                    System.out.println("ucgen ama eskenar degil");
                }
            }else{
                System.out.println("Sen ucgen degilsin");
            }
        }
    }
