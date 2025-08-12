import java.io.*;
import java.util.Scanner;
public class ReverseArray{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        }
        for(int k=n-1;k>=0;k--){
        System.out.print(arr[k]+" ");
        }
        sc.close();
     }
     
}
        
        
    

      
