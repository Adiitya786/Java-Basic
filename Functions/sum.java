 import java.util.*;
 public class sum {
    // to calculate sum of three numbers.
    public static int calculateSum(int num1,int num2 ,int num3){
        return num1 + num2+ num3;
    }
    public static int calculateSum(int num1,int num2 ,int num3,int num4){
        return num1+num2+num3+num4;
    }
    public static void main(String[] args) {
        System.out.println("enter the value of three operands:");
        Scanner sc  = new Scanner(System.in);
        /*  int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();*/
        System.out.println("sum is:"+ calculateSum(3,4,5));
        System.out.println("sum is:"+ calculateSum(1,2,4,5));
        sc.close();
    }
    
}
