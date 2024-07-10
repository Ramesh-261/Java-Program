import java.util.Scanner;
public class palindrom
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter Number--:");
	    int n=sc.nextInt();
	    int sum=0;
	    int tmp=n;
	    while(n!=0){
	        sum=(sum*10)+n%10;
	        n=n/10;
	    }if(sum==tmp){
	      System.out.println("Pdrm");  
	    }else{
	        System.out.println("Npdrm");
	    }
		
	}
}