import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();
        int counter = 0;

        while (n!=0){
            n/=10;
            counter++;
        }
        System.out.println("Number of digits in the given number is "+counter);
    }
}
