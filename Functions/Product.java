public class Product {
    public static int Multiply(int a, int b){
        return a*b;
    }
    public static float Multiply(float a, float b){
        return a*b;
    }
    public static void main(String[] args) {
        
    // either i have to specify inteeger xf in float datatype or either use double not float.
        System.out.println(Multiply(2.5f,1.5f ));   
        System.out.println(Multiply(2,4 ));
    }
}
