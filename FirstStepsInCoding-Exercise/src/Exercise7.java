import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Цена на ягодите в лева – реално число в интервала [0.00 … 10000.00]
        double strawberriesPrice = Double.parseDouble(scanner.nextLine());

        // Количеството бананите в килограми – реално число в интервала
        double bananaKilograms = Double.parseDouble(scanner.nextLine());

        // Количеството портокалите в килограми – реално число
        double orangesKilograms = Double.parseDouble(scanner.nextLine());

        // Количеството малините в килограми – реално число
        double raspberriesKilograms = Double.parseDouble(scanner.nextLine());

        // Количеството ягодите в килограми – реално число
        double strawberriesKilograms = Double.parseDouble(scanner.nextLine());





        // Цена на малините за килограм = 0.5 от цената на ягодите
        double raspberriesPrice = strawberriesPrice * 0.5;

        // Цена на портокалите = Цена на малините - ( 0.4  * Цена на малините )
        double orangesPrice = raspberriesPrice - ( 0.4 * raspberriesPrice);

        // Цена на бананите = Цена на малините - ( 0.8 * Цена на малините)
        double bananasPrice = raspberriesPrice - ( 0.8 * raspberriesPrice);

        // Сума за малините = количеството малините * Цена на малините
        double sumOfRaspberries = raspberriesKilograms * raspberriesPrice;

        // Сума за портокалите = Количеството портокалите * Цена на портокалите
        double sumOfOranges = orangesKilograms * orangesPrice;

        // Сума за бананите = Количеството бананите  * Цена на бананите
        double sumOfBananas = bananaKilograms * bananasPrice;

        // Сума за ягодите = Количеството ягодите * Цена на ягодите
        double sumOfStrawberries = strawberriesKilograms * strawberriesPrice;




        // Обща сума
        double totalSum = sumOfRaspberries + sumOfOranges + sumOfBananas + sumOfStrawberries;


        // парите, които са необходими на Мария
        System.out.printf("%.2f", totalSum);



    }
}
