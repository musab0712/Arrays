import java.lang.Math;

class InverseNum{
    public static void main(String[] args) {
        int number=675;
        int inverse=0,i=1,rem;
        while(number>0){
            rem=number%10;
            number/=10;
            inverse=inverse+(int)(Math.pow(10,rem-1))*i;
            i++;
        }
        System.out.println(inverse);
    }
}