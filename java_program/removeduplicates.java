class duplicates{
    public static void main(String args[]){
        int arr[]=new int[]{1,3,5,7,6,4,3,6,2,2,5,8};
        boolean vist[]=new boolean[arr.length];
        for(int i=0;i<vist.length;i++){
            vist[i]=false;
        }
        for(int i=0;i<arr.length;i++){
            vist[arr[i]]=true;
        }
        for(int i=0;i<vist.length;i++){
            if(vist[i]==true){
                System.out.println(i);
            }
        }
    }
}