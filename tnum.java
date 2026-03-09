public class tnum{
    public static void main(String args[]){
        int arr[]={56,74,64,83,27,30};
        int min=0;
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        int result=max-min;
        System.out.println("largest distance ="+result);
    }
}