import java.util.*;
import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        System.out.println("enter the marks of student");
        int sum = marks1 + marks2 + marks3;
        int percentage = (sum / 3);
        System.out.println(sum);
        System.out.println(percentage + "%");
    }
}
