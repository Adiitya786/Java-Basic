import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a and b to perform operands:");
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        System.out.println("enter the operator:");
        char op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println("a+b= "+(a+b));
                break;
            case '-':
                System.out.println("a-b= "+(a-b));
                 break;
            case '*':
                System.out.println("a*b= "+(a*b));
                 break;
            case '/':
                System.out.println("a/b= "+(a/b));
                 break;
            case '%':
                System.out.println("a%b= "+(a%b));
                 break;
            default:
            System.out.println("entered operator cannot be find in this calculator.");
                break;
            }sc.close();

    }
   
}
