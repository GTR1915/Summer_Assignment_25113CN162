import java.util.Scanner;
public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int initial_number = n;
        sc.close();
        int reverse;
        for (reverse = 0; n!=0;){
            int last_digit = n%10;
            n/=10;
            reverse*= 10;
            reverse += last_digit;
        }
        if (reverse==initial_number)
            System.out.println("The given number is palindrome.");
        else
            System.out.println("The given number is not a palindrome.");
    }
}
