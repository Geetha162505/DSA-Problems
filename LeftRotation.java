//import java.io.*;//importing java input and output funuctions and * is for the selecting the data from that
import java.util.Scanner;//importing Scanner to take input for the problem
public class LeftRotation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//taking size of the array
        int d=sc.nextInt();//taking number of rotations
        int[] arr=new int[n];//intializing the array
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();//taking input for the array
        }
        d=d%n;//because when d is greater than n, we only need to rotate the array d%n times
        for(int i=0;i<n;i++){
            System.out.print(arr[(i+d)%n]+" ");//printing the rotated array
        }
        sc.close();
    }

}


