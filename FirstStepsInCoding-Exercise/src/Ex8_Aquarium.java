import java.util.Scanner;

public class Ex8_Aquarium {
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
        double liters = volume * 0.001; // 1000



        // пресмятаме процент
        double percentAfter = percent * 0.01;

        // литрите , които ще ни трябват за пълен аквариум без консумативи
        double allLiters = liters * ( 1 - percentAfter);

        // 85
        //75
        //47
        //17 -> 0.17
        // 1 куб.м вода е = 1000 куб.см и за това го смятаме * 0.001

        System.out.printf("%.2f", allLiters);

    }
}
