import java.util.Scanner;

public class decimalTobinary {
    public static int DectoBin(int decNum){
        int rem, bin=0,pow=0;
        while (decNum>0) {
              rem=decNum%2;
              bin = bin + rem*(int)Math.pow(10,pow);
              decNum=decNum/2;
              pow++;
            
        }
        return bin;
    }
    public static void main(String[] args) {
        System.out.println("enter decimal digits(1 to 9) to convert into binary digit:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("after conversion into decimal form:"+DectoBin(n));
        sc.close();
    }
}
