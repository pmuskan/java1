import java.util.Scanner;
class employee{
    String name;
    int id;
    int work_days;
    int per_day_salary;
    int anual;
    employee(String name,int id,int work_days,int per_day_salary,int anual){
        this.name=name;
        this.id=id;
        this.work_days=work_days;
        this.per_day_salary=per_day_salary;
        this.anual=cal();
        //System.out.println(anual);
        System.out.println(name+" "+id+" ");
        System.out.println("ANNUAL SALARY:"+anual);

    }
    int cal(){
        return work_days*per_day_salary;
    }
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter name:");
        String name=s.next();
        System.out.println("enter id:");
        int id=s.nextInt();
        System.out.println("work days:");
        int work_days=s.nextInt();
        System.out.println("enter per day salary:");
        int per_day_salary=s.nextInt();
        int anual=work_days*per_day_salary;
        new employee(name, id, work_days, per_day_salary,anual);
    }
}
