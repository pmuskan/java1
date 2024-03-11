//import java.util.Scanner;
class missing_num{
    public static void main(String args[]){
        int arr[]=new int[] {1,2,3,4,-1,2,3};
        for(int i=0;i<=arr.length;i++)//{
            //if(arr[i]==-1){
                //continue;
            //}
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=-1;
                }
            }
        }
        for(int num=0;num<arr.length;num++){
            if(arr[num]!=-1){
            System.out.println(num);
            }
        }
    }

}