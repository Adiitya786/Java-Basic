import java.util.*;
public class primeNo {
    public static void main(String[] args) {
        System.out.println("enter the number to check either prime or not:");
        Scanner  sc =  new Scanner(System.in);
        int num = sc.nextInt();
        int count =0;
        for(int i=2;i<num;i++){
            if(num%i==0){
                count =1;
            }
        }
        if(num<=0){
            System.out.println("enter natural numbers only.......");
        }
        else if(count == 0){
            System.out.println(num+" is a prime number.");
        }
        else{
           System.out.println(num+" is a not prime number."); 
        }
        sc.close();
    }
}
