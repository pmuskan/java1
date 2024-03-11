//set balance
    //credit func user amount pass
    //add the amount and give total balance
    //create func debit
    //minus the amount and give balance
class Accounts {
    static int start_amt=1000;
    int amount_credit;
    int amount_debit;
    //int balance;
    void getamount(int amount_credit,int amount_debit){
        this.amount_credit=amount_credit;
        this.amount_debit=amount_debit;
        //balance=a;
    }
    void printst(){
        System.out.println("start_amt:"+start_amt);
    }
    void credit(){
        if(amount_credit>200000){
            System.out.println("large amount can not be processed");
        }

        else{
        start_amt=start_amt+amount_credit;
        System.out.println("credit balance:"+start_amt); 
    }
    }
    void debit(){
        if(amount_debit < 0){
            System.out.println("negative value!!!");
        }
        else{
        start_amt=start_amt-amount_debit;
        System.out.println("debit balance:"+start_amt);}
    }
    public static void main(String args[]){
        Accounts acc= new Accounts();
        acc.getamount(200,100);
        acc.credit();
        acc.debit();
        acc.printst();
    }
}