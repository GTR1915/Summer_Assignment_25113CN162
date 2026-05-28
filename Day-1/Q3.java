import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();
        if (n<0){
            System.out.print("Factorial of negative numbers don't exists.");
            return;
        }

        int fact = 1;
        for (int i = 2; i<=n; i++)
            fact *= i;
        System.out.print("Factorial of "+n+" is "+fact);
    }
}
