import java.util.*;
import java.lang.Math;

class InverseNum{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        int inverse=0,i=1,rem;
        while(number>0){
            rem=number%10;
            number/=10;
            inverse=inverse+(int)(Math.pow(10,rem-1))*i;
            i++;
        }
        System.out.println(inverse);
    }
}