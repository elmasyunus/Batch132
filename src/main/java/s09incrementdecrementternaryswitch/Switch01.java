package s09incrementdecrementternaryswitch;

public class Switch01 {
    public static void main(String[] args) {
        //Ex.1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz.
        // Sunday==1... Saturday==>7

        String dayname = "Tuesday";
        //1.Yol: if-else
        if(dayname.equalsIgnoreCase("Sunday")){
            System.out.println(1);
        } else if (dayname.equalsIgnoreCase("Monday")) {
            System.out.println(2);
        }else{
            System.out.println("Lutfrn gecerli bir gun ismi giriniz");
        }
     //2.Yol:switch
        switch(dayname){

            case "Sunday":
                System.out.println(1);
                break;
            case "Monday":
                System.out.println(2);
                break;
            case "Tuesday":
                System.out.println(3);
                break;
            case "Wednesday":
                System.out.println(4);
                break;
            case "Thursday":
                System.out.println(5);
                break;
            case "Friday":
                System.out.println(6);
                break;
            case "Saturday":
                System.out.println(7);
                break;
                //Ikiden fazla durum varsa switch daha iyidir. Ikiye kadar if else if olabilir.
        }

    }
}
