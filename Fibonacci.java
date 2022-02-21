class Fibonacci{
    public static void main(String[] args) {
        int n=9;
        int a=0,b=1;
        System.out.print(a+", "+b+", ");
        for(int i=2;i<n;i++){
            System.out.print(a+b+", ");
            b=a+b;
            a=b-a;
        }

    }
}