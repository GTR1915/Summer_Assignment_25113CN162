import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();
        int sum;
        for (sum = 0; n!=0;){
            sum += n%10;
            n/=10;
        }
        System.out.println("Sum of digits of the given number is "+sum);
    }
}
