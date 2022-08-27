import java.util.Scanner;

public class new_7_Food_Delivery {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //  chicken = 10.35
            //  fish = 12.40
            //  vegetarian = 8.15


            int chickenMeal = Integer.parseInt(scanner.nextLine());
            int fishMeal = Integer.parseInt(scanner.nextLine());
            int vegetarianMeal = Integer.parseInt(scanner.nextLine());

            double chickenPrice = (chickenMeal * 1.0) * 10.35;
            double fishPrice = (fishMeal * 1.0) * 12.40;
            double vegetarianPrice = (vegetarianMeal * 1.0) * 8.15;

            double allPrice = chickenPrice + fishPrice + vegetarianPrice;

            double discount = allPrice * 0.20;
           // double delivery = 2.50;

            double price = discount + allPrice + 2.50;

            System.out.println(price);
            //  System.out.printf("%.2f",Price);



        }
}

/*
            double chicken = 10.35;
            double fish = 12.40;
            double vegetarian = 8.15;


            int chickenMeal = Integer.parseInt(scanner.nextLine());
            int fishMeal = Integer.parseInt(scanner.nextLine());
            int vegetarianMeal = Integer.parseInt(scanner.nextLine());

            double chickenPrice = chickenMeal * chicken;
            double fishPrice = fishMeal * fish;
            double vegetarianPrice = vegetarianMeal * vegetarian ;
            double allPrice = chickenPrice + fishPrice + vegetarianPrice;

            double discount = allPrice * 0.20;
            double delivery = 2.50;

            double price = discount + allPrice + delivery;

            System.out.println(price);
            //  System.out.printf("%.2f",Price);
 */