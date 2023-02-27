package s05hypecastinstringmanipulation;

public class SwapValues {
    public static void main(String[] args) {
        //Swap yer degistirmedir 1. kapta Patates 2. kapta Domates==>yer degistiler

        int a = 12;
        int b = 5; // Swap"den sonra ==> a=5 ve b=12
        int temp = 0;
        System.out.println("a:"+a);//12
        System.out.println("b"+b);//5

        //1. adim
        temp = a;

        //2. adim
        a=b;

        //3.adim
        b=temp;
        System.out.println("a:"+a);//5
        System.out.println("b+b");//12

        //2.degistirme yolu. Interview larda bu daha cok cikar.
        int x = 12;
        int y = 5;

        x = x+y;

        y = x-y;

        x = x-y;

    }
}
