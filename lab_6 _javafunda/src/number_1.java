import java.util.Scanner;
public class number_1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Enter  Your name:");
     String name = sc.nextLine();

     System.out.println("Enter Your age:");
     int age = sc.nextInt();

     System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}