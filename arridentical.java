import java.io.*;
import java.util.*;

public class arridentical {
    public static boolean identical(int[] arr,int[] arr1){
        if(arr.length!=arr1.length){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr1[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
         int[] arr=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
        int m=sc.nextInt();
        int[] arr1=new int[m];
        for(int i=0;i<m;i++){
             arr1[i]=sc.nextInt();
         }
        boolean ans=identical(arr,arr1);
        System.out.println(ans);
    }
}