import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
       /*  int number = 10;
           System.out.println(number > 5); // 10 > 5  => the result of this will be true ( the output)
       */



     /*     int number = 10;
            double decimalNumber = 6.5;
            System.out.println(decimalNumber > 5); // the output will be true
     */



     /*    String name = "Desi";
           String lastName = "Topuzakova";
       // System.out.println(name == lastName);  == сравнява адресите в паметта
          System.out.println(name.equals(lastName)); // с командата equals искаме да сравним стойностите на текстовете
        // като се Run - не това , започва да ми сравнява двата текста ( по стойности ) и в случая ще върне false ,
        // защото нямат еднакви символи на съответните позиции , и дължината им е различна
        // особености: ако дълж. на текстовете е равна започва буква по буква да сравнява двата текста
        // output на тази програма е false
      */


        /*
        // ако имаме:
        String name = "Desi";
        String lastName = "Desi";
        System.out.println(name.equals(lastName)); // output - a на това ще ми е true
        // защото имат 1. еднаква дължина
        //  2. еднакви символи на съответните позиции => значи тези два текста са равни
         */




        // boolean isValid = 3;   не е вярно това не може булева променлива да е равна на 3, трябва да е равна на нещо друго
        //  или е true , или е false
        //  int number = 6.5;   както тук не може int да е равно на 6.5


        /*
        //boolean isValid = false;
        boolean isValid = 5 < 6;
        int number = 5 + 5; // щом тук при int имаме израз, който ни дава целочислена стойност
        // може и при boolean - типа да има някакъв израз , boolean isValid да е равно на някакъв израз
        // примерно 5 < 6
        System.out.println(isValid);
        // output на това е true
        */


        /*
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        // ако числото, което е въведено е > 10 -> "Bigger than 10" да ни отпечата
        // в противен случай ( числото <= 10 ) -> "Smaller than 10"
        if (number > 10) {
            System.out.println("Bigger than 10");
        } else {
            System.out.println("Smaller than 10");
        }
       */




   /*
        Scanner scanner = new Scanner(System.in);
        // цяло число от 1 до 5
        // 1 -> one , 2 -> two , 3 -> three , 4 -> four , 5 -> five
        int number = Integer.parseInt(scanner.nextLine());
        if (number == 1) {
            System.out.println("one");
        } else if (number == 2) {
            System.out.println("two");
        } else if (number == 3) {
            System.out.println("three");
        } else if (number == 4) {
            System.out.println("four");
        } else if (number == 5) {
            System.out.println("five");
        } else {
            System.out.println("Invalid number");
        }
    */



        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println(Math.pow(5 , 3));

        int number = Integer.parseInt(scanner.nextLine());
        if (number == 1) {
            System.out.println("Desi");
            System.out.println("Desi");
            System.out.println("Desi");
            System.out.println("Desi");
            System.out.println("Desi");
            System.out.println("Desi");
        } else if ( ) {

        }
         */




         /*
               Scanner scanner = new Scanner(System.in);
               System.out.printf("%.0f", Math.ceil(45.8));

               output: 46
         */



        /*
        Scanner scanner = new Scanner(System.in);
        String currentDay = "Monday";
        if (currentDay.equals("Monday")) {
            double salary = Double.parseDouble(scanner.nextLine());
        }
        System.out.println(salary); // тук променливата salary не е валидна, защото е извън блока от код, където е създадена

         */


        /*

        ВАЖНО!! за живота на променливите!!

        Scanner scanner = new Scanner(System.in);
        String currentDay = "Monday";
        if (currentDay.equals("Monday")) {
            double salary = Double.parseDouble(scanner.nextLine());
            {
                System.out.println(salary); // тук вече така си е ок , валидна е - променливата salary
            }
            System.out.println(salary); // тук също е ок, намира се в същия блок от код
        }
        System.out.println(salary); // тук променливата salary НЕ е валидна, ИЗВЪН блока от код, където е създадена

        */





    }
}
