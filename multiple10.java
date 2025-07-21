import java.util.Scanner;

public class multiple10 {
    public static void main(String[] args) {
        int n=1;
        while(n!=0){
            System.out.println("enter the number:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num%10==0){
              System.out.println("number "+num+" is a multiple of 10; therefore came out of the loop.");
              break;
            }
              sc.close();
        }
    }
}
