public class next_Prime{
    public static void main(String[] args) {
       
        int num =19;
        int next =num+1;
        while (true) {
            boolean isPrime=true;
        
        for(int i=2;i<=next/2;i++){
            if(next%i==0){
                isPrime= false;
                break;
            }
        }
            if(isPrime){
                System.out.println(next);
                break;
            }
            next++;
        
    }
    }
}