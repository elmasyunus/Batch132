package s11forloop;

public class ForLoop01 {
    public static void main(String[] args) {

        //Ex.1: Verilen bir Str de ilk a harfinden önceki tüm karakterleri console a yazdiriniz
        // "I love Java" ==> "I love J"
        String s = "Tramvay";
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(ch);
        }

        //Ex.2:Verilen bir Str de son a" dan sonraki tum char lari ters sirada yazdiriniz
        // "Germany" ==>

        String t = "Germany";
        for (int i=t.length()-1; i>=0; i--){
            char ch = t.charAt(i);
            if (ch=='a'){
                break;
            }
            System.out.print(ch);
        }


    }
}
