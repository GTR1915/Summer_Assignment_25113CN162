import java.util.Scanner;
public class Q16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();
        System.out.println("Armstrong numbers between "+n1+" to "+n2+" are:");
        for (int i=n1; i<=n2; i++){
            int n3 = i, n4 = i;
            int number_of_digit = 0;
            while (n3!=0){
                n3/=10;
                number_of_digit++;
            }

            int sum;
            for (sum = 0; n4!=0;){
                sum += Math.pow(n4%10, number_of_digit);
                n4/=10;
            }
            if (i==sum)
                System.out.println(i);            
        }
    }
}
