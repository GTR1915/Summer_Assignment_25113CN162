import java.util.Scanner;
public class Q14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number fibonacci position: ");
        int n = sc.nextInt();
        sc.close();
        int n1 = 0;
        int n2 = 1;
        for (int i = 1; i<=n; i++){
            n2 += n1;
            n1 = n2-n1;
        }
        System.out.println("Fibonacci term: "+n1);
    }
}
