class factorial{
    int n;
    int f=1;
    void num(int n){
        this.n=n;
    }
    void fact(){
        for(int i=1;i<=n;i++){
            f*=i;
        }
        System.out.println("factorial:"+f);
    }
    public static void main(String arg[]){
        factorial obj=new factorial();
    obj.num(5);
    obj.fact();
    }

}