import java.io.*;
import java.util.*;

public class Productitself {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] l=new int[arr.length];
        l[0]=1;//lets consider;
        for(int i=1;i<l.length;i++){
            l[i]=l[i-1]*arr[i-1];
        }
        int[] r=new int[arr.length];
        r[arr.length-1]=1;
        for(int i=arr.length-2;i>=0;i--){
            r[i]=r[i+1]*arr[i+1];
        }
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=l[i]*r[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(ans[i]);
        }
    }
}