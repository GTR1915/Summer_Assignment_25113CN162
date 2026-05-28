import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i<=10; i++)
            System.out.printf("%d X %d = %d\n", n, i, i*n);
    }
}
