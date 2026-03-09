public class avg{
    public static void main(String args[]){
        int arr[]={52,74,12,96,35};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        double avg=(double)sum/arr.length;
        System.out.println("The average of the numbers is:"+avg);
        }
    }
