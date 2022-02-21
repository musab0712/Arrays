class SumOfSubArray{
    public static void main(String[] args) {
        int a[]= {5,6,7,2,8,9};
        int sum;
        for(int i=0;i<a.length;i++){
            sum=0;
            for(int j=i;j<a.length;j++){
                sum += a[j];
                System.out.print(sum);
            }
        }
    }
}