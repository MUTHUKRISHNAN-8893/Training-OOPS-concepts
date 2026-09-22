class car{
    void start(){
        System.out.println("Car is starting");
    }
}
class Maruthi extends car{
    @Override
    void start(){
        
        System.out.println("Maruthi is starting");
    }
}
class Swift extends Maruthi{
    @Override
    void start(){
        System.out.println("Swift is starting");
    }
}
public class methodoverriding {
    public static void main(String []args){
        car b1 =new Maruthi();
        car b2=new Swift();
        b1.start();
        b2.start();
    }
}
