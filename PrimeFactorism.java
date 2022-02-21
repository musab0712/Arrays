
class PrimeFactorism{
    public static void main(String[] args) {
        int n=5;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                n/=i;
                i=1;
            }
        }  
    }
}