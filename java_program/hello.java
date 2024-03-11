import KCG.college;
class student {
    int id;
    int mat;
    int sci;
    int eng;
    String name;
    int total,avg,cgpa;
    int credit=27;
    char year;
    void details(){
        System.out.println("id"+id);
        System.out.println("name:"+name);
        System.out.println("mat:"+mat);
        System.out.println("sci:"+sci);
        System.out.println("eng:"+eng);
        total=mat+sci+eng;
        avg=(total)/3;
        cgpa=total/27;
        System.out.println("total:"+total);
        System.out.println("avg"+avg);
        System.out.println("cgpa:"+cgpa);
    }
    class A extends college{
        A obj=new A();
        obj.dispaly();
    }
    public static void main(String[] args) {
        student obj1=new student();
        student obj2=new student();
        student obj3=new student();
        student obj4=new student();
        obj1.id=1;
        obj2.id=2;
        obj3.id=3;
        obj4.id=4;
        obj1.mat=90;
        obj1.sci=50;
        obj1.eng=80;
        obj2.mat=80;
        obj2.sci=89;
        obj2.eng=70;
        obj3.mat=76;
        obj3.sci=65;
        obj3.eng=89;
        obj4.mat=90;
        obj4.sci=50;
        obj4.eng=60;
        obj1.name="muskan";
        obj2.name="suhana";
        obj3.name="hana";
        obj4.name="kate";
        obj1.details();
        obj2.details();
        obj3.details();
        obj4.details();
    }
}