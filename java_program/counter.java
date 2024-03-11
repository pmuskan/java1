class counter{
    int count=0;
    void printf(){
        count++;
    }
    void printff(){
        System.out.println(count);
    }
    public static void main(String[] args) {
        counter c=new counter();
        counter c1=new counter();
        c.printf();
        c.printf();
        c1.printf();
        c1.printff();
        c.printff();
        c1.printff();
    }
}