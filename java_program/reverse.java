class reverse{
    int l=5;
    int digit=56984;
    int rev=0;
    int rem;
    //int digit;
    void check(){
        for(int i=0;i<=4;i++){
            rem=digit%10;
            rev=rev*10+rem;
            digit/=10;
        }
        System.out.println("the reverse num is:"+rev);
    }
    public static void main(String args[]){
        reverse obj=new reverse();
        obj.check();
    }
}