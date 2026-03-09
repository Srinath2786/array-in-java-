public class count{
    public static void main(String args[]){
        int arr[]={7,8,5,74,15,28,76};
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The count of Even:"+even);
        System.out.println("The count of Odd:"+odd);
    }
}
