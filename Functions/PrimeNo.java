import java.util.Scanner;

public class PrimeNo {
   /*  public static void Prime(int x){
       int count =0,i;
        for( i=2;i<x;i++){
            if(x%i==0){
             count=1;}
        }
        if( x<=0){
            count=1;}
        if (count==0){
            System.out.println(x+" is prime number.");
        }
        else{
            System.out.println(x+" is not a prime number.");
        }

        }*/
        public static boolean isPrime(int x){
            
            if(x==2){
            return true;}
            for(int i=2;i<=Math.sqrt(x);i++){
                if(x%i==0){
                return false;
               }
            }
            return true;
        }
              public static void main(String args[]){
             System.out.println("enter the number to check prime or not:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println(isPrime(n));
            
           
            sc.close();
        }
    }

