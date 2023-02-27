package s03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //Kull adresini aliniz ve ekrana yazdiriniz
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi yaziniz...");

        //nextLine() method"u kullanicidan cok kelimelik String almak icin kullanilir
        String address = input.nextLine();

        System.out.println(address);
    }
}
