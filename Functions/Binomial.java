import java.util.Scanner;

public class Binomial {
    public static int factoo(int x){
        int f=1;
        for(int i=1;i<=x;i++){
            f=f*i;
        }
        return f;
    }
    public static  int Factorial(int n, int r){
        int n_fact= factoo(n);
        int r_fact= factoo(r);
        int nr_fact=factoo(n-r); 
        int bino = n_fact/(r_fact*nr_fact);
        return bino;
    }
    public static void main(String[] args) {
        System.out.println("enter the value of n and r:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("the binomial coefficient is:"+Factorial(n, r));
        sc.close();

    }
    
}
