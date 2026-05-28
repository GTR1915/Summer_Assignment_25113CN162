import java.util.Scanner;
public class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 2; i<n/2+1; i++)
            if (n%i==0){
                System.out.println("Given number is not a prime number.");
                System.exit(0);
            }
        System.out.println("Given number is a prime number.");
    }
}
