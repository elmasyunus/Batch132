package s09incrementdecrementternaryswitch;

public class IncrementDecrement01 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        a=a+2;//veya a +=2
        System.out.println(a);//7

        //Ex-1:Bir tane integer variable olusturun ve onu iki sekilde 5 arttirin.

        int b = 3;
        b +=5;
        System.out.println(b);

        //Decrement 1:
        int c = 8;
        c = c-3;
        System.out.println(c);

        c-=3;
        System.out.println(c);

        //Increment 2: Carpma ile arttirmak
        int d=6;
        d = d*2;
        System.out.println(d);

        d *=2;
        System.out.println(d);

        //Decrement 2:
        int e =24;
        e=e/2;
        System.out.println(e);

        e /= 2;
        System.out.println(e);

        //"1" ile increment ve decrement; Bu uzgulamalarda cok kullanilir.
        //f = f+1
        //f *= 1;
        //f++;

        //1 ile decement
        int h = 10;

        //h =h-1;
        //h -= 1;
        h--;

        //"post increment" ve "pre-increment"
        int i = 10;
        int k = i++;//post increment cunku increment# variable in isminden sonra yazildi.
        System.out.println(k);//10 ==> i arttirilmadan k ya kondugu icin k nin degeri 10 olur.
        System.out.println(i);//11 ==> i satir sonunda arttirildigi icin i nin degeri 11 olur.

        int m = 15;
        int n = ++m;//pre-increment cunku inc, variable in isminden once yazildi.
        System.out.println(m); // 16 ==> m arttirildiktan sonra n ye konuldugu icin n nin degeri 16 olur
        System.out.println(n); // 16 ==> m arttirildiktan sonra n ye konuldugu icin n nin degeri 16 olur.

        //post-decrement ve pre-decrement
        int p = 17;
        int r = p--;
        System.out.println(p);//16
        System.out.println(r);//17

        int s = 20;
        int t = --s;
        System.out.println(s);//19
        System.out.println(t);//19











    }
}
