package day10switchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //Ex1: Ay numarasini verince o numaradan baslayip 12 ci aya kadar tum aylarin isimlerini yazdiran kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Baslangic ayinin kacinci ay oldugunu giriniz...");
        int numOfMonth = input.nextInt();
        switch (numOfMonth){
            case 1:
                System.out.println("Jan.");
            case 2 :
                System.out.println("Feb");
            case 3 :
                System.out.println("March");
            case 4 :
                System.out.println("April");
            case 5 :
                System.out.println("May");
            case 6 :
                System.out.println("June");
            case 7 :
                System.out.println("july");
            case 8:
                System.out.println("Aug");
            case 9 :
                System.out.println("Sep.");
            case 10 :
                System.out.println("oct");
            case 11 :
                System.out.println("Nov");
            case 12 :
                System.out.println("Dec.");
                break;
            default:
                System.out.println("Gecerli bir ay numarasi giriniz...");
        }
        //Switch de Strinh kullanilabilir, int, byte, short, char kullanilabilir.long, boolean, float, double kull.maz.
        //2 durumdan az ve 2 durum icin switch kullanilamaz.
        //switch(dayName.toLowerCase()){ yapilirsa buyuk harfte yazilsa kod calisir, ignore edilmemis olur. switchlerde
        //ignore yapmak icin bu yontem kullanilabilir. Az kullanilsa da toUpperCase de kullanilabilir. Ignorecase bir
        //seyin esitligini kontrol ettigi icin burada kullanilamaz.

    }

}
