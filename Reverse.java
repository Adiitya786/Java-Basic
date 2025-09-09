public class Reverse {

    public static int rev(int n ,int rev){
        if(n==0){
            return rev;
        }
        return rev(n/10,rev*10+(n%10));
    }
    public static void main(String[] args) {
        System.out.println(rev(12345,0));
    }
}
