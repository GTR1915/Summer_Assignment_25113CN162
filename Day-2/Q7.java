import java.util.Scanner;
public class Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();
        if (n==0){
            System.out.println("Product of digits of the given number is 0");
            System.exit(0);
        }

        int product;
        for (product = 1; n!=0;){
            product *= n%10;
            n/=10;
        }
        System.out.println("Product of digits of the given number is "+product);
    }
}
