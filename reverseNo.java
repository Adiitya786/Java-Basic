import java.util.Scanner;

public class reverseNo {
    public static void main(String args[]){
        System.out.println("enter the no. which you want to reversed:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem,rev=0;
        while(n>0){
            rem = n%10;
            rev = rev*10 + rem;
            n=n/10;
        }
        System.out.println("reverse of given nuber is:"+rev);
        sc.close();
    }
}
