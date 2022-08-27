import java.util.Scanner;

public class new_9_FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                // дължина
                int length = Integer.parseInt(scanner.nextLine());
                // широчина
                int width = Integer.parseInt(scanner.nextLine());
                // височина
                int height = Integer.parseInt(scanner.nextLine());
                // процент
                double percent = Double.parseDouble(scanner.nextLine());



                // пресмятаме обема на аквариума
                int volume = length * width * height;

                // общо литри , които аквариума ще събере
                double liters = volume * 0.001; //  :1000

                // литрите , които ще ни трябват за пълен аквариум
                double allLiters = liters * ( 1 - (percent * 0.01));

                // System.out.printf("%.2f", allLiters);
                System.out.println(allLiters);


    }
}
