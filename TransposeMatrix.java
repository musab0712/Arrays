class TransposeMatrix{
    public static void main(String[] args) {
        int arr[][]={{1,3,4},{9,5,7},{6,2,8}};
        int temp;
        for(int i=0; i<3; i++){
            for(int j=i; j<3; j++){
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}