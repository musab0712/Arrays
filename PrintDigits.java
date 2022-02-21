import java.util.*;
class PrintDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int reverse=0;
        int reminder;
        while(num>0){
            reminder=num%10;
            reverse=reverse*10+reminder;
            num=num/10;
        }
        while(reverse>0){
            System.out.println(reverse%10);
            reverse/=10;
        }
    }
}