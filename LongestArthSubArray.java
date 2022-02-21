import java.util.*;
class LongestArthSubArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n-1];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1,j=0;i<n;i++,j++){
            b[j]= a[i]-a[i-1];
        }
        int tempCount=0,count=0,num=b[0];
        for(int i=0;i<n-1;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        for(int i=0;i<n-1;i++){
            if(num>b[i]||num<b[i]){
                num=b[i];
                if(count>tempCount){
                    tempCount=count;
                    count=1;
                }
            }
            else
                count++;
        }
        System.out.println(tempCount+1);
    }
}