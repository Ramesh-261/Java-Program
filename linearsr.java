import java.io.*;
import java.util.*;

public class linearsr {
    public static boolean present(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        boolean ans=present(arr,k);
        if(ans==true){
          System.out.println("True");   
        }else{
             System.out.println("False");
        }
       
    }
}