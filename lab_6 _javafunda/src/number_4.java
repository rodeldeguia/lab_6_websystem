import java.util.Scanner;
// a program that check if  the string is palindrome
public class number_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palindrome Checker");
        System.out.println("Enter text:");
        String text = sc.nextLine();
        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }
        if (text.equalsIgnoreCase(reverse)) {
            System.out.println("the text \""+ text+"\" You entered is palindrome");
        }
        else {
            System.out.println("the \""+ text+"\" You entered is not palindrome");
        }

    }
}
