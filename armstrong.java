public class armstrong {
    public static void main(String[] args){
        int n = 153;
        int backup = n;
        int result=0;
        while(n>0){
            int digit=n%10;
            result = result + digit*digit*digit;
            n= n / 10;
        }
        if(result==backup){
            System.out.println(backup+" is an Armstrong number");
        }
        else{
            System.out.println(backup+" is not an Armstrong number");
        }
    }
}
