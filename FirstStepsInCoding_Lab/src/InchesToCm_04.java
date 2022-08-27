import java.util.Scanner;

public class InchesToCm_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. инчове (реално число) -> конзолата
        // 2. см = инчове * 2.54
        // 3. отпечатваме см

        double inches = Double.parseDouble(scanner.nextLine());
        double cm = inches * 2.54;
        System.out.println(cm);
    }
}
