public class search{
    public static void main(String args[]){
        int arr[]={78,69,27,15,95};
        int search=15;
        boolean found=false;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==search){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}