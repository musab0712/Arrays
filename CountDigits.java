import java.util.*;
class CountDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=0;
        while(num>0){
            num/=10;
            i++;
        }
        System.out.print(i);
    }
}