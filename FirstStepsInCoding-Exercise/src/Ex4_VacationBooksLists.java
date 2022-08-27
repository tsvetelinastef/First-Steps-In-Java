import java.util.Scanner;

public class Ex4_VacationBooksLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Брой страници  в текущата книга
        int pages = Integer.parseInt(scanner.nextLine());
        // Страници , които може да прочита за 1 час
        int pagesPerDay = Integer.parseInt(scanner.nextLine());
        // Броя на дните , за които трябва да прочете книгата
        int days = Integer.parseInt(scanner.nextLine());


        //  общото време за четене на книгата
        int allHours = pages / pagesPerDay;

        // получения резултат делим на броя дни, за да получим необходимите часове на ден
        int hoursPerDay = allHours / days;

        // броят часове, които Жоро трябва да отделя за четене всеки ден
        System.out.println(hoursPerDay);

    }
}
