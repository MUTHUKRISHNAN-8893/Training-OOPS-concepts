class car{
    void start(){
        System.out.println("Car is starting");
    }
    void start(String mode){
        System.out.println("Car is starting with model:"+mode);
    }
    void start(string mode, int temperature){
        System.out.println("Car is starting with model:"+mode+" and temperature:"+temperature);
    }
}
public class methodoverloading{
    public static void main(String[]args){
        car c1=new car();
        c1.start();
        c1.start("Maruthi");
        c1.start("Maruthi", 30);
    }
}