class car{
    private String model;
    private double price;
    private String fueltype;
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setPrice(double price){
        if(price>0){
            this.price=price;
        }
        else{
            System.out.println("Price should be greater than 0");
        }
    }
    public double getPrice(){
        return price;
    }
    public void setFueltype(String fueltype){
        this.fueltype=fueltype;
    }
    public String getFueltype(){
        return fueltype;
    }
}
public class encapsulation{
    public static void main(String []args){
        car c1=new car();
        c1.setModel("Maruthi");
        c1.setPrice(200000);
        c1.setFueltype("Petrol");
        System.out.println("Model:"+c1.getModel());
        System.out.println("Price:"+c1.getPrice());
        System.out.println("Fueltype:"+c1.getFueltype());
    }
}
