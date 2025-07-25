import java.util.Scanner;

public class Palindrome{
    public static void IsPalindrome(int x){
         int rem,rev=0;
         int copy_x=x;
         while(x>0){
              rem =x%10;
              rev = rev*10 + rem;
              x=x/10;
         }
           if(copy_x==rev){
             System.out.println(rev+" is  palindrome.");

        }
        else{
             System.out.println(copy_x+" is not a palindrome.");
        }
    }
    public static void main(String[] args) {
         System.out.println(" Enter a number to check whether it is palindrome or not:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        IsPalindrome(num);
        sc.close();
    }
}