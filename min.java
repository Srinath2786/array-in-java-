import java.util.*;
public class min{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]={4,6,23,57,79};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
             }
        }
        System.out.println("The minimum number is: "+min);
    }
}