//class salary,abs getsalary;
abstract class salary_abstract{
    int id;
    String name;
    int working_days;
    int salary;
    abstract void getsalary(int working_days);
    abstract void getcompany();
    abstract void get_profile(int id,String name);
}
class staff extends salary_abstract{
    void get_profile(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("id:"+id+"name:"+name +"working days:"+working_days);
    }
    //@Override
    void getsalary(int working_days){
        this.working_days=working_days;
        System.out.println("salary:"+working_days*1000);
    }
    void getcompany(){
        System.out.println("company:KCG");
    }
} 
class non_staff extends salary_abstract{
    void get_profile(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("id:"+id+"name:"+name +"working days:"+working_days);
    }
    //@Override
    void getsalary(int working_days){
        this.working_days=working_days;
        System.out.println("salary:"+working_days*500);
    }
    void getcompany(){
        System.out.println("company:KCG");
    }

}
class office extends salary_abstract{
    void get_profile(int id,String name){
        this.id=id;
        this.name=name;
        System.out.println("id:"+id+"name:"+name +"working days:"+working_days);
    }
    //@Override
    void getsalary(int working_days){
        this.working_days=working_days;
        System.out.println("salary:"+working_days*2000);
    }
    void getcompany(){
        System.out.println("company:KCG");
    }
    public static void main(String[] args) {
        salary_abstract s=new staff();
        s=new office();
        s.get_profile(001,"mus");
        s.getsalary(12);
        s.getcompany();
        s=new non_staff();
        s.getsalary(21);
        s.get_profile(001,"shan");
        s.getcompany();
        s=new staff();
        s.get_profile(002,"harsh");
        s.getsalary(10);
        s.getcompany();
    }
}

