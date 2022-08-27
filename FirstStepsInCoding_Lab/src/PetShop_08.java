import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogs = Integer.parseInt(scanner.nextLine());
        int otherDogs = Integer.parseInt(scanner.nextLine());

        double sum = dogs * 2.5 + otherDogs * 4;

        System.out.printf(" %.1f lv." , sum );
    }
}
