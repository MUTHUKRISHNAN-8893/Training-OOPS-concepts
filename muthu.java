 class bankaccount {
    String holdername;
    int accountnumber;
    double balance;
    bankaccount(String holdername,int accountnumber, int balance){
       this.holdername=holdername;
       this.accountnumber=accountnumber;
       this.balance=balance;
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited amount:"+amount);
    }
    void display(){
        System.out.println("Holdername:"+holdername);
        System.out.println("Accountnumber:"+accountnumber);
        System.out.println("Balance:"+balance);
    }
}
public class muthu{
    public static void main(String[] args){

    bankaccount b1=new bankaccount("Nithish",123456,10000);
    bankaccount b2=new bankaccount("Siva",123457,20000);
        b1.display();
        b2.display();
        b1.deposit(200);
        
    }
}
