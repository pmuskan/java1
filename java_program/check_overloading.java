class check{
    int  a;
    int b;
    void display(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a+b);
    }
    void display(int a,int b,int c){
        this.a=a;
        this.b=b;
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        check obj=new check(15);
        System.out.println(obj.a);
    }
}
    