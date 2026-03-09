public class arr{
    public static void main(String args[]){
        int arr[]={2,6,8,5,9,4};
        int search=8;
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==search){
                count++;
            }
        }
        System.out.println("Element found "+count+"times");
    }
}