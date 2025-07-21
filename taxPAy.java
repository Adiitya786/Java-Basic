
import java.util.Scanner;

public class taxPAy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the annual income :");
        int income= sc.nextInt();
        if(income<500000){
            System.out.println("we will have to give 0% tax");
            System.out.println("income after tax="+income);}
        else if(income>500000 && income<1000000){
            System.out.println("we will have to give 20% tax");
            System.out.println("income after the tax ="+(income-(0.2f*income)));}
        else{
           System.out.println("we will have to give 30% tax");
           System.out.println("income after tax="+(income-(0.3f*income)));
        } 

      sc.close();
}
    
}
