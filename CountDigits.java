class CountDigits{
    public static void main(String[] args) {
        int num=568;
        int i=0;
        while(num>0){
            num/=10;
            i++;
        }
        System.out.print(i);
    }
}