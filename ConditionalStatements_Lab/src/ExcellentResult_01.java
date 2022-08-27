import java.util.Scanner;

public class ExcellentResult_01 {
    public static void main(String[] args) {
        // 1.  оценка ( цяло число от конзолата )
        // 2. проверка ( оценка >= 5 ) -> "Excellent!"
        Scanner scanner = new Scanner(System.in);
        int grade = Integer.parseInt(scanner.nextLine());
        if ( grade >= 5 ) {
            System.out.println("Excellent!");   // ако напишем на конзолата 6 -> ще изведе Excellent!
            // защото отговаря на условието
            // ако въведем 4 на конзолата , условието няма да е вярно 4 не е >= 5  (и няма да ни отпечата нищо )
            // if - проверката не се изпълнява и продължаваме надолу

        }
    }
}
