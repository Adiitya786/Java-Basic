
public class Sorting {
       public static void bubble_sort(int arr[]){
        for (int i =0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

       }

        public static void selection_sort(int arr[]){
            for(int i=0;i<arr.length-1;i++){
                int max_pos =i;
                for(int j=i+1;j<arr.length;j++){
                      if(arr[max_pos]<arr[j]){
                        max_pos=j;
                      }
                }
                //swap
                int temp = arr[i];
                arr[i] = arr[max_pos];
                arr[max_pos] = temp;
            }
        }
   


        public static void insertion_sort(int arr[]){
            for(int i =1;i<arr.length;i++){
                int curr=arr[i];
                int prev = i-1;
                while(prev>=0&&arr[prev]<curr){
                    arr[prev+1]=arr[prev];
                    prev--;
                }
                arr[prev+1]= curr;
            }
        }

       public static void print_array(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3};
       // bubble_sort(arr);
       // selection_sort(arr);
        insertion_sort(arr);
        print_array(arr);
    }
}