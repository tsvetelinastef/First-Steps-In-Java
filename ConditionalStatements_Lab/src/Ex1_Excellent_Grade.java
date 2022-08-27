import java.util.Scanner;

public class Ex1_Excellent_Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                // 1.  оценка ( цяло число от конзолата )
                // 2. проверка ( оценка >= 5 ) -> "Excellent!"

                int grade = Integer.parseInt(scanner.nextLine());
                if ( grade >= 5 ) {
                    System.out.println("Excellent!");   // ако напишем на конзолата 6 -> ще изведе Excellent!
                    // защото отговаря на условието
                    // ако въведем 4 на конзолата , условието няма да е вярно 4 не е >= 5  (и няма да ни отпечата нищо )
                    // if - проверката не се изпълнява и продължаваме надолу

        }

    }
}
