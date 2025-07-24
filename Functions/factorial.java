import java.util.Scanner;

public class factorial {
    public static int Factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        
         System.out.println("Enter the number of factorial you want:");
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         System.out.println("Factorial of the number is:");
         System.out.println(Factorial(n));
         sc.close();
    }
    
}
