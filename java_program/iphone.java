abstract class iphone {
    abstract void display();
}
class iphone11 extends iphone {
    void display(){
        System.out.println("this is iphone 11:");
    }
}
class iphone12 extends iphone{
    void display(){
        System.out.println("this is iphone12:");
    }
}
class iphone_abstarct{
    public static void main(String[] args) {
        iphone s=new iphone11();
        s.display();
        s=new iphone12();
        s.display();
    }
}
