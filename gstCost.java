import java.util.Scanner;

public class gstCost {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the cost of three items:");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        float total= (float)a+b+c;
        System.out.println(total);
        float gst= (float)(0.18*total+total);
        System.out.println("cost including the GST:"+gst);
        sc.close();
    }
    
}
