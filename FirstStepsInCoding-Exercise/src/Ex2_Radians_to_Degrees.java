import java.util.Scanner;

public class Ex2_Radians_to_Degrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // четем радианите от конзолата
        double radians = Double.parseDouble(scanner.nextLine());

        // да намерим градусите
        double deg = radians * 180 / Math.PI;

        // принтираме на конзолата
        //System.out.printf("%.0f", deg);
        System.out.println(deg);
    }
}
