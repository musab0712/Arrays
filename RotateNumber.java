
class RotateNumber{
    public static void main(String[] args) {
        int n = 3;
        int k=4;
        int count=0;
        int r=n;
        while(r>0){
            r/=10;
            count++;
        }
        while(k>0){
            r=n%10;
            n/=10;
            n=n+(int)Math.pow(10,count-1)*r;
            k--;
        }
        System.out.print(n);
    }
}