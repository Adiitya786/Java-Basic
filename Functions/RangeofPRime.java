import java.util.Scanner;
   
public class RangeofPRime{

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
        public static void PrimeinRange(int x){
            for(int i=2;i<=x;i++){
                if(isPrime(i)){
                    System.out.print(i+"  ");
                }
            }
        }
    public static void main(String[] args) {
        System.out.println("enter the number to check prime or not:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            PrimeinRange(n);
            
           
            sc.close();
    }

}