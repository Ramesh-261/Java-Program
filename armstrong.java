import java.util.Scanner;
public class armstrong
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter Number--:");
	    int n=sc.nextInt();
	    int sum=0;
	    int d1=0;
	    while(n!=0){
	         n=n/10; 
	         d1++;
	    }
	      System.out.println(d1); 
	     int tmp=n;
	    while(n!=0){
	        int d=n%10;
	        sum+=(Math.pow(d,d1));
	        n=n/10;
	    }if(sum==tmp){
	      System.out.println("Armstrng");  
	    }else{
	        System.out.println("NArmstrng");
	    }
		
	}
}