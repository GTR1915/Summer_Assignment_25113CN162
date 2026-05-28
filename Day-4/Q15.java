import java.util.Scanner;
public class Q15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n, n1, n2;
        n = sc.nextInt();
        n1 = n2 = n;
        sc.close();
        int number_of_digit = 0;

        while (n1!=0){
            n1/=10;
            number_of_digit++;
        }

        int sum;
        for (sum = 0; n2!=0;){
            sum += Math.pow(n2%10, number_of_digit);
            n2/=10;
        }
        if (n==sum)
            System.out.println("Given number is an armstrong number.");
        else
            System.out.println("Given number is not an armstrong number.");
    }
}
