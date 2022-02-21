class LongestArthSubArray{
    public static void main(String[] args) {
        int[] a = {5,4,6,7,2,8,9,3};
        int[] b = new int[a.length-1];
        for(int i=1,j=0;i<a.length;i++,j++){
            b[j]= a[i]-a[i-1];
        }
        int tempCount=0,count=0,num=b[0];
        for(int i=0;i<a.length-1;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        for(int i=0;i<a.length-1;i++){
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