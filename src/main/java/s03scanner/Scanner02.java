package s03scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

        //Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yazdiriniy
        Scanner input =  new Scanner(System.in);

        System.out.println("Ilk isminizi giriniz");
        //Next method kullanicidan tek kelimeli String almak icin kullanilir.
        //ilk ismi alir.
        String firstName = input.next();

        System.out.println("Soy isminiyi giriniz");
        String lastName = input.next();

        System.out.println(firstName + lastName);

    }



}
