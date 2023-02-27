package ssg10switch;

public class ForLoop04 {

    public static void main(String[] args) {

        /*
     Write code to print integers from 3 to 9 excluding 5
      */


        for (int i = 3; i < 10; i++) {

            if (i != 5) {

                System.out.print(i+ " ");
            }

        }

        //2.way:
        for(int i=3;i<10;i++){

            if(i==5){
                break;


            }else {

                System.out.print(i+ " ");
            }

    }
}}

