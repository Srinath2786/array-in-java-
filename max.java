import java.util.*;
public class max{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={4,6,23,57,79};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum number is: "+max);
    }
}