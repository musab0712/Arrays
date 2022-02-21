
class Prime{

    public static void main(String[] args) {
       int t = 5;
        for(int i=2;i<=t;i++){
            boolean flag=false;
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.out.print(i+" ");
            }
            // else{
            //     System.out.println("prime");
            // }
        }
    }
}