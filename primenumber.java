import java.util.Scanner;
public class primenumber
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int tmp=0;
	    for(int i=2;i<=Math.sqrt(n);i++){
	        if(n%i==0){
	            tmp++;
	        }
	    }
	    if(tmp>0){
	        System.out.println("not prime");
	    }else{
	        System.out.println("prime");
	    }
		
	}
}

// public class Main
// {
// 	public static void main(String[] args) {
// 	    //int n=23;	  
// 	    int tmp=0;
// 	    for(int i=1;i<=100;i++){
// 	        	   // int tmp=0;
// 	        for(int j=2;j<i;j++){
// 	            if(i%j==0){
// 	            tmp++;
// 	           }
// 	        }
	    
// 	    if(tmp==0){
// 	        System.out.println(i);
// 	    }else{
// 	        tmp=0;
// 	    }
// 	    }	
// 	}
// }