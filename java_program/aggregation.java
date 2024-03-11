class aggregation{
    int std;
    String name;
    Address ad;
    aggregation(int std,String name,Address ad){
        this.std=std;
        this.name=name;
        this.ad=ad;
    }
    void display(){
        System.out.println("std:"+std +"name:"+name +"address:" +ad.pin);
    }
}
class Address{
    int pin;
    String street;
    int no;
    Address(int pin,String street,int no){
        this.pin=pin;
        this.street=street;
        this.no=no;
    }
    public static void main(String args[]){
        Address ad=new Address(19,"cmp",5);
        aggregation obj1=new aggregation(2,"num",ad);
        obj1.display();
    }
}