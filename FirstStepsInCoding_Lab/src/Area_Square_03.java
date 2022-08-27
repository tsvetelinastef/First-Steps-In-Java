import java.util.Scanner;

public class Area_Square_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. въвеждаме стойност за страната - променлива
        //2.  лице на квадрата -> страна * страна
        //3. отпечатваме лицето
        // sout + Tab ili Enter ->   System.out.println( // area - nie go pishem tva);
        int a = Integer.parseInt(scanner.nextLine());
        int area = a * a;
        System.out.println(area);
    }
}
