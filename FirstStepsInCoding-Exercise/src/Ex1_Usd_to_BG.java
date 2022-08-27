import java.util.Scanner;

public class Ex1_Usd_to_BG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // прочитаме числото от конзолата - double
        double usd = Double.parseDouble(scanner.nextLine());

        // български лева -> щатски долари
        double bgn = usd * 1.79549;

        // принтираме на конзолата
        System.out.println(bgn);

    }
}
