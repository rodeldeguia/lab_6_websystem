import java.util.Scanner;
//a program that input 5 numbers and calculate its value and find average
public class number_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 5;
        int [] arr = new int[6];
        int sum = 0;

        for(int i = 1; i <=num; i++) {
            System.out.print("Enter number " + i + ":");
            arr[i] = sc.nextInt();

        }
        System.out.print("Your number are: ");
        for (int i = 1; i <=num; i++) {
            System.out.print(arr[i] + " ");

        }
        for(int number : arr) {
            sum += number;
        }
        System.out.println();
        int average = sum/num;
        System.out.println("sum is :" + sum);
        System.out.println("Average is : " + average);


    }
}
