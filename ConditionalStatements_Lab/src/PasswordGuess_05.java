import java.util.Scanner;

public class PasswordGuess_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. парола -> текст от конзолата
        // 2. проверка дали паролата е "s3cr3t!P@ssw0rd" -> Welcome
        // 3. противен случай: -> "Wrong password!"
        String password = scanner.nextLine();
        if(password.equals("s3cr3t!P@ssw0rd")){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
