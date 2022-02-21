class MaxTillI{
    public static void main(String[] args) {
        int a[]={9,8,7,6,1,2,3,4,5,6};
        int b[]=new int[10];
        b[0]=a[0];
        int max=a[0];
        for(int i=1;i<10;i++){
            if(a[i]>max){
                b[i]=a[i];
                max=a[i];
            }
            else{
                b[i]=max;
            }
        }
        for(int i=0;i<10;i++){
            System.out.print(b[i]+" ");
        }
    }
}