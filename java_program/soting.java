import java.util.Arrays;

class sorting{
    public static void main(String args[]){
        int count=0;int odd=0;
        //int arr[][]=new int[2][3];
        int arr[][]={{1,2,3},{3,4,5}};
        int arr2[][]={{1,2,3},{4,6,8}};
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]%2==0){
                    count+=1;
                }
                else{
                    odd+=1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
        //int odd=arr.length-count;
        //add
        int add=0;
        int i,j;
        int sum[][]={{}};
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    add+=arr[i][k]+arr2[k][j];
                }
                sum[i][j]=add;
                add=0;
            }
        }
        for(int m=0;m<3;m++){
            for(int n=0;n<3;n++){
                System.out.println(sum[m][n]);
            }
        }
        System.out.println("even count:" +count);
        System.out.println("odd count:" +odd);
        

    }
}
