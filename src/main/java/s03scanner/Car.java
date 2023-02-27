package s03scanner;

public class Car {

    //Variable`lar olusturalim
    public String model = "Corolla";
    public int fiyat =20000;

    //Method`lar olusturalim
    //Note: "return type" void oldugunda method icinde "return" kelimesi kullanilmaz
    public void hareket(){
        System.out.println("Corolla hiyli hareket eder...");
    }

    public void dur(){
        System.out.println("Corolla güvenli bir sekilde durur...");
    }
}
