import java.util.Scanner;

public class GitTest {
    public static void main(String[] args) {
        System.out.println("Введите свое имя");
        Scanner in = new Scanner(System.in);
        String userName = in.nextLine();
        System.out.println("Hello, " +userName + "!");
    }
}
