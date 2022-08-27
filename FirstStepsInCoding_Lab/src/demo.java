 import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int money=Integer.parseInt(scan.nextLine());
        double decimalNumber= Double.parseDouble(scan.nextLine());
        String name = scan.nextLine();

        System.out.println(money);
        System.out.println(decimalNumber);
        System.out.println(name);
    }
}

/*
public class demo {
    public static void main(String[] args) {
        int count = 100;
        double decimalNumber = 34.6;
        String name = "Desi";

        System.out.println(count);
    }
}

// output: 100
*/