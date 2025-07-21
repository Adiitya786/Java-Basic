import java.util.Scanner;

public class sumNAturalno {
    public static void main(String args[]){
        System.out.println("enter number of 1st natural number you want to sum off:");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0,count=1;
        while(count<=n){
            sum = sum +count;
            count++;
        }
        System.out.println("sum of 1st "+n+" natural number is: "+ sum);
        sc.close();
    }
}
