import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();
            int Roll_Number = sc.nextInt();
            String Intrest = sc.next();
            System.out.println("Name" + name);
            System.out.println("interest" + Intrest);
            System.out.println("roll number" + Roll_Number);
        }

    }
}