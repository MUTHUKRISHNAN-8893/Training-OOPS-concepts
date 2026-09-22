class student{
    String name;
    int age;
    void display(){
        System.out.println("Nithish siva subramanian");
        System.out.println(name);
        System.out.println(age);
    }
}
public class oops
{ 
    public static void main(String []args){
        student s1=new student();
       s1.name="Nithish";
        s1.age=20;
        s1.display();
    }
}