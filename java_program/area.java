import java.util.Scanner;
class circle{
    int r;
    float area_c(int r){
        this.r=r;
        return (r*r*3.14f);
    }
}
class rectangle{
    int l;
    int b;
    int h;
    int area_r(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
        return (l*b*h);
    }
}
class shape{
    // int n;
    public static void main(String[] args) {
        int n;
        // shape sh=new shape();
        Scanner obj=new Scanner(System.in);
        System.out.println("enter num:");
        n=obj.nextInt();
        circle c=new circle();
        rectangle r=new rectangle();
        switch(n){
            case 1:
                System.out.println("enter radius:");
                int radius=obj.nextInt();
                float res=c.area_c(radius);
                System.out.println("Area of circle is:"+res);
                 break;
            case 2:
                System.out.println("enter l,b,h:");
                int l=obj.nextInt();
                int b=obj.nextInt();
                int h=obj.nextInt();
                int rec=r.area_r(l,b,h);
                System.out.println("Area of rectangle is:"+rec);
                break;
        }
        obj.close();
    }
}
    
