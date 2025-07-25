import java.util.Scanner;

public class BinarytoDecimal {
    public static int Bintodec(int binNum){
        int dec =0,last_dig,pow=0;
        while(binNum>0){
             last_dig = binNum%10;
             dec = dec + last_dig*(int)Math.pow(2, pow);
            binNum=binNum/10;
            pow++;
        }
        return dec;
    }
    public static void main (String args[]){
        System.out.println("enter only binary digit(0 or 1) to convert into decimal form:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("after conversion into decimal form:"+Bintodec(n));
        sc.close();
    }
}
