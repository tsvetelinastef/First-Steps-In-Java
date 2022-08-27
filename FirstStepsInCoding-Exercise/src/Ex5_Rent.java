import java.util.Scanner;

public class Ex5_Rent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Наем за залата – цяло число в интервала [100..10000]
        int rent = Integer.parseInt(scanner.nextLine());


        //  Торта – цената ѝ е 20% от наема на залата
        double cakePrice = rent * 0.2;
        // Напитки – цената им е 45% по-малко от тази на тортата
        double drinkPrice = cakePrice - ((cakePrice * 0.45));
        // Аниматор – цената му е 1/3 от цената за наема
        double animatorPrice = (rent * 1.0) / 3 ;
        // необходима сума
        double necessarySum = rent + cakePrice + drinkPrice + animatorPrice;


        // какъв бюджет ще бъде необходим за организиране на тържеството

        System.out.println(necessarySum);

    }
}
