public class SumOfDigits {
    public static void sod(int n,int sum){
        if(n==0){
           System.out.println( sum);
           return;
        }
        sod(n/10,sum+(n%10));
       
    }
    public static void main(String[] args) {
      sod(1234,0);
    }
}