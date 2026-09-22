import java.util.Scanner;
public class automorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        long square=n*n;
        int temp=n;
        long sq=square;
        boolean isAutomorphic=true;
        while(temp>0){
            if(temp%10!=sq%10){
                isAutomorphic=false;
                break;
            }
            temp/=10;
            sq/=10;
        }
        if(isAutomorphic){
            System.out.println(n+" is an Automorphic number");
        }
        else{
            System.out.println(n+" is not an Automorphic number");
        }


    }
}`-