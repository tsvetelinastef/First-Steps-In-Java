/* import java.util.Scanner;

public class GreetingByName_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. въвеждаме име -> променлива (String)
        // 2. отпечатваме -> "Hello, <name>! "
        String name = scanner.nextLine();
        System.out.println("Hello, <name>!");
// this will output:  baby    Hello, <name>!
    }
}
*/

import java.util.Scanner;

public class GreetingByName_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
// this will output:  baby    Hello, <name>!