/*Leather seats 2. Sunroof/moonroof 3. Heated seats 4. Backup camera 5. Navigation system 
6. Bluetooth 7. Remote start 8. Blind spot monitoring 9. Third-row seating 10. Apple CarPlay/Android Auto */
class car{
    int seats;
    String steering;
    int tyre;
    int m;
    int speed;
    int dis;
    car(int seats,String steering,int tyre,int m,int speed,int dis){
        this.seats = seats;
        this.steering = steering;
        this.tyre = tyre;
        this.m = m;
        this.speed = speed;
        this.dis = dis;
        //System.out.println("seats:"+seats+"tyre:"+tyre+"milage:"+milage);
    }
    void display(){
        System.out.println("basic car");
        System.out.println("seats:"+seats+"tyre:"+tyre+"milage:"+m);
    }
}
class tata extends car{
    String color;
    int milage;
    tata(String color,int milage){
        super(4,"default model",4,40,50,20);
        this.color=color;
        this.milage=milage;
        System.out.println("tata black color:");
    }
    void cal(){
        milage=speed*dis;
        System.out.println("milage of tata:"+milage);
    }
}
class punch extends tata{
    String cam;
    String audio;
    punch(String cam,String audio){
        super("red",20);
        this.cam=cam;
        this.audio=audio;
        System.out.println("punch has:"+cam +audio);
    }
}
class harrior extends punch{
    String roof;
    int no;
    harrior(String a,int b){
        super("cam yes","audio yes");
        this.roof=a;
        this.no=b;
        System.out.println("hii harrior");
    }
    public static void main(String args[]){
    harrior h=new harrior("roof top",9);
    h.cal();
    h.display();
    }
}

