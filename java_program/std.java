import java.util.Scanner;
class std{
    int roll;
    String name;
    int age;
    int marks;
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        std s=new std();
        System.out.print("enter name:");
        s.name=obj.next();
        System.out.print("enter age:");
        s.age=obj.nextInt();
        System.out.print("enter marks:");
        s.marks=obj.nextInt();
        System.out.print("enter roll:");
        s.roll=obj.nextInt();
        System.out.println("age:"+s.age);
    }
}