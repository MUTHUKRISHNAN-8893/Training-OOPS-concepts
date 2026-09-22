class Cars {
    String color;
    int model;
    String brand;
    void maruthi(){
        System.out.println("Color:"+color);
        System.out.println("Model:"+model);
        System.out.println("Brand:"+brand);

    }
    void bolero(){
        System.out.println("Color:"+color);
        System.out.println("Model"+model);
        System.out.println("Brand:"+brand);
 n\vchvcsd        
    }
    void scorpio(){
        System.out.println("Color:"+color);
        System.out.println("Model:"+model);
        System.out.println("Brand:"+brand);
    }
}
public class Car{
    public static void main(String[]args){
        Cars c1=new Cars();
        c1.color="red";
        c1.model=2026;
        c1.brand="maruthi";
         c1.maruthi();
        Cars c2=new Cars();
        c2.color="black";
        c2.model=2025;
        c2.brand="bolero";
         c2.bolero();
        Cars c3=new Cars();
        c3.color="white";
        c3.model=2024;
        c3.brand="scorpio";
        c3.scorpio();
    }
}
