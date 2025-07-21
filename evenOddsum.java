import java.util.Scanner;

public class evenOddsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evensum=0,oddsum=0;
        while(true){
            System.out.println("enter the number:");
            int num = sc.nextInt();
            if(num%2==0){
                evensum+=num;
            }
            else{
                oddsum+=num;
            }
            sc.nextLine(); //   to clear leftover new lines.
            System.out.println("if you want to add up more number then write 'yes' otherwise 'no':");
            String choice = sc.nextLine();
          
            if(choice.equalsIgnoreCase("no")){
                break;
            }
            else if(choice.equalsIgnoreCase("yes")){
                continue;
            }
            else{
                System.out.println("invalid input ....assuming you wants to continue. ");
                continue;
            }
              
        }
        sc.close();
        System.out.println(" sum of even numbers you entered:"+evensum);
        System.out.println(" sum of odd numbers you entered:"+oddsum);
    }
}
