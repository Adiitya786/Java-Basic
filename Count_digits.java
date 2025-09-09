public class Count_digits {

    public static void count(long n , int count){
        if(n==0){
            System.out.println(count);
            return;
        }
        count(n/10,count+1);
    }
    public static void main(String[] args) {
         long n = 123456789;
        count(n,0);
    }
}
