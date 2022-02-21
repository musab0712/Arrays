import java.util.*;
class Fibonacci{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print(a+", "+b+", ");
        for(int i=2;i<n;i++){
            System.out.print(a+b+", ");
            b=a+b;
            a=b-a;
        }

    }
}