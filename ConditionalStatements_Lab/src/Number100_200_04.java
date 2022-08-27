import java.util.Scanner;

public class Number100_200_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. цяло число
        // 2. проверка число < 100 -> Less than 100
        // 3. проверка число > 200
        // 4. проверка число е  между 100 и 200
        int number = Integer.parseInt(scanner.nextLine());
        if (number < 100) {
            System.out.println("Less than 100");
        } else if (number > 200) {
            System.out.println("Greater than 200");
        } else { // между 100 и 200
            System.out.println("Between 100 and 200 ");
        }

    }
}
