// a program that make a fibonacci sequence
public class number_2 {
    public static void main(String[] args) {


        int x = 10;
        int a = 0;
        int b = 1;

        for (int i = 1; i <= x; i++) {
            System.out.println(a+" ");
            int sum = a+b;
            a  = b;
            b = sum;
        }
    }
}
