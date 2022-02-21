import java.util.*;
class SumOfSubArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[]= new int[n];
        int sum;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum=0;
            for(int j=i;j<n;j++){
                sum += a[j];
                System.out.print(sum);
            }
        }
    }
}