package s11forloop;

public class ForLoop04 {
    public static void main(String[] args) {
        //Ex.1: 5 ten 8 e kadar tam sayilarin toplamini veren kodu yaziniz.
        //  5+6+7+8 ==> 26
        int sum =0;
        for (int i=5 ;   i<9;  i++){
            sum=sum+i;

        }
        System.out.println(sum);

        //Ex.2: 7 den 9 a kadar tam sayilarin carpimini veren kodu yaziniz.
        // 7*8*9 ==> 504
        int mul =1;
        for (int c=7; c<10; c++)
            mul=mul*c;
        System.out.println(mul);
    }
}
