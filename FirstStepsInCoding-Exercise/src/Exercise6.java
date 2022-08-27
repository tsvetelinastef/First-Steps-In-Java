import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // четем от кнзолата


        // Броят дни
        int days = Integer.parseInt(scanner.nextLine());
        // брой сладкари
        int chefs = Integer.parseInt(scanner.nextLine());


        // брой торти
        int cakes = Integer.parseInt(scanner.nextLine());
        // брой гофрети
        int waffles = Integer.parseInt(scanner.nextLine());
        // брой палачинки
        int pancakes = Integer.parseInt(scanner.nextLine());


        // цената на тортите
        double cakesPrice = cakes * 45;
        // цената на гофретите
        double wafflesPrice = waffles * 5.80;
        // цената на палачинките
        double pancakesPrice = pancakes * 3.20;


        // смятаме сумата за всеки един от продуктите от един сладкар за един ден
        // сума = (цената на тортите + цената на гофретите + цената на палачинките) * брой сладкари
        double sum = (cakesPrice + wafflesPrice + pancakesPrice) * chefs;
        // сума от цяла кампания = сума * брой дни от кампания
        double sumAll = sum * days;
        // крайна сума след разходи = сума от цяла кампания - (сума от цяла кампания / 8)
        double sumAfter = sumAll - (sumAll / 8);


        // принтиране, като закръгляме до втория знак
        // %n - нов ред
        //   \n - nov red
        // в случая до  ...("%f%n", ...);
        // или просто "s o u t + Tab / Enter " на всеки отделен ред
        System.out.printf("%f", sumAfter);   // 426175.750000
        System.out.println();
        System.out.printf("%.0f", sumAfter); // 426176
        System.out.println();
        System.out.printf("%.2f", sumAfter); // 426175.75

    }
}
