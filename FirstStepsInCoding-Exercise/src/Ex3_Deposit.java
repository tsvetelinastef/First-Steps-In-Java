import java.util.Scanner;

public class Ex3_Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // прочетем входните данни от конзолата
        double deposit = Double.parseDouble(scanner.nextLine()); // депозирана сума
        int month = Integer.parseInt(scanner.nextLine()); // срок на депозита
        double percent = Double.parseDouble(scanner.nextLine()); // годишен лихвен процент

       // System.out.println(percent / 100);

        // сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        // sum = deposit + month * ( ( deposit * percent / 100 ) / 12 );
        // sum = deposit + month * ( ( deposit * percent * 0.01  ) / 12 );
        // percent / 100 = percent * 0.01
        double sum = deposit + month * ((deposit * percent / 100 ) / 12);

        // принтираме сумата
        System.out.println(sum);

    }
}
