import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// import java.time.temporal.ChronoUnit; 

public class Main {

    static Scanner sc = new Scanner(System.in);

    static List<Admin> admins = new ArrayList<>();
    static List<User> users = new ArrayList<>();
    static List<Book> books = new ArrayList<>();

    static {
        admins.add(new Admin("Hari", "1108", "mahin"));
        users.add(new User("mahin", "mahin", "1108"));
        users.add(new User("sundar", "sundu", "1603"));
        books.add(new Book("a", "Author a", 1, 50, 50, "Hari", 120));
        books.add(new Book("b", "Author b", 2, 100, 100, "Hari", 240));
        books.add(new Book("c", "Author c", 3, 30, 30, "Hari", 360));
        books.add(new Book("d", "Author d", 4, 60, 60, "Hari", 420));
    }

    public static void main(String[] args) {
        homepage();
    }

    static void homepage() {
        System.out.print("\033[H\033[2J");
        System.out.println("-----LIBRARY MANAGEMENT SYSTEM-----");
        System.out.println("    -> Enter 1 for Admin Login");
        System.out.println("    -> Enter 2 for User Login");
        System.out.println("    -> Enter 3 to exit");
        System.out.print("Enter Choice : ");
        int n = Integer.parseInt(sc.nextLine());
        if (n == 1) {
            Admin.login();
        } else if (n == 2) {
            User.login();
        } else if (n == 3) {
            System.exit(0);
        } else {
            System.out.println("Invalid Choice !\nEnter correct option");
            homepage();
        }
    }
}