import java.util.Arrays;
class count_numbersin_array{
    public static void main(String args[]){
        int arr[]=new int[]{1,3,5,7,6,4,3,6,2,2,2,2,5};
        int vist[]=new int[arr.length];
        for(int i=0;i<vist.length;i++){
            vist[i]=0;
        }
        for(int i=0;i<arr.length;i++){
            vist[arr[i]]+=1;
        }
        for(int i=0;i<vist.length;i++){
            if(vist[i]>=1){
                System.out.println("Element " + i + " appears " + vist[i] + "times");
            }
        }
        int max = Arrays.stream(vist).max().getAsInt(); 
        for(int i=0;i<vist.length;i++){
            if(vist[i]==max){
                System.out.println("Largest element in given array is " + i + "times" + max);
            }
        }
    }
}