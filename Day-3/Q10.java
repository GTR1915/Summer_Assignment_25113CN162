import java.util.Scanner;
public class Q10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        System.out.println("Prime numbers between "+n1+" to "+n2+" are:");
        for (int i=n1; i<=n2; i++){
            boolean isPrime = true;
            for (int j = 2; j<i/2+1; j++)
                if (i%j==0){
                    isPrime = false;
                    break;
                }
            if (isPrime)
                System.out.println(i);
        }
    }
}
