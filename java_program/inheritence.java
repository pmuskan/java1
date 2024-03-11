import java.util.Scanner;
class employee{
    int id;
    String name;
    long number;
    String address;
    int salary;
    int working_days;
    employee(int id,String name,long number,String address){
        this.id=id;
        this.name=name;
        this.number=number;
        this.address=address;
    }
    void calculateworking_days(int working_days){
        System.out.println("working days:"+working_days);
    }
    void getsalary(int working_days){
        //this.salary=salary;
        this.working_days=working_days;
        salary=1000*working_days;
        System.out.println("the one month salary is: "+salary);
    }
}
class staff extends employee{
    int exp;
    String role;
    String dept;
    staff(int exp,String role,String dept){
        super(01,"mus",6782222221l,"tn");
        this.exp=exp;
        this.role=role;
        this.dept=dept;
        //System.out.println(+exp+role+dept);
    }
    void getdetails(){
        System.out.println("id "+id +"name:"+name +"num:"+number +"address:"+address);
        System.out.println("exp:"+exp +"role "+role +"dept:"+dept);
    }
    public static void main(String[] args) {
        //Scanner obj=new Scanner(System.in);
        //obj.working_days=nextline();
        //s.staff();
        staff s=new staff(3,"tech ","it");
        s.getdetails();
        s.calculateworking_days(30);
        s.getsalary(30);
    }

}
