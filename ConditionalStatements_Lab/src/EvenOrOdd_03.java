import java.util.Scanner;

public class EvenOrOdd_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. цяло число
        // 2. проверка дали е четно -> even
        // ако остатъкът при деление с 2 е нула
        // 3. в противен случай ( не е четно ) -> odd
        int number = Integer.parseInt(scanner.nextLine());
        if(number % 2 == 0) {
            System.out.println("even");  // ако остатъкът е = на 0 , значи е even
        } else {
            System.out.println("odd");  // ако остатъкът ми е различен от 0
        }
    }
}
