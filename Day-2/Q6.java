import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();
        int reverse;
        for (reverse = 0; n!=0;){
            int last_digit = n%10;
            n/=10;
            reverse*= 10;
            reverse += last_digit;
        }
        System.out.println("Reverse of the given number is "+reverse);
    }
}
