import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
         System.out.println("enter the number to find factorial:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact=1;
        for(int i=n;i>0;i--){
            fact*=i;
        }
        System.out.println("factorial of given number is: "+fact);
        sc.close();
    }
}
