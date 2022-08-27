import java.util.Scanner;

public class GreaterNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. две цели числа
        // 2. проверка   първото > второто -> печатаме първото
        // 3. в противен случай: първото <= второто -> печатаме второто
        int number1 = Integer.parseInt(scanner.nextLine());    // 5
        int number2 = Integer.parseInt(scanner.nextLine());   // 3


        if (number1 > number2) {
            System.out.println(number1);
        } else {              // n1 >= n2
            System.out.println(number2);
        }

    }
}
