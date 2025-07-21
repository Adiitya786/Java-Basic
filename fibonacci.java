import java.util.*;
public class fibonacci {

    public static void main(String args[]){
        int first=0,sec=1,third;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n= sc.nextInt();
        System.out.println(first);
        System.out.println(sec);
        for(int i=1;i<=n-2;i++){
            third= first+sec;
             System.out.println(third);
            first=sec;
            sec=third;
            
        }sc.close();
    }
}