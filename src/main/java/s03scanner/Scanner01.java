package s03scanner;

import java.util.Scanner;
public class Scanner01 {

    //Kullanicidan data alip kodlarimizda kullanacagiz
    //Scanner class kullanicidan data alip kodlarimizda kullanmayi saglar. Scanner class javanin util kütüphanesi
    // icindedir

    public static void main(String[] args) {

        //1. adim: Scanner Class`tan obje olustur
        Scanner input = new Scanner(System.in);

        //2. adim: kullaniciya ne istedigimize dair mesaj veririz


        System.out.println("Lutfen yasinizi giriniz...");

       //3. adim: Uygun method u kullanarak kullanicinin verdigi data`yi memory ye yerlestiriniy
        byte age = input.nextByte();

        System.out.println(age);
    }


}
