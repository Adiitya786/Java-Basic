 import java.util.*;
 public class sum {
    public static int calculateSum(int num1,int num2 ,int num3){
        int sum = num1 + num2+ num3;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("enter the value of three operands:");
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum =  calculateSum(a,b,c);
        System.out.println("sum is:"+ sum);
        sc.close();
    }
    
}
