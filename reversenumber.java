import java.util.Scanner;
public class reversenumber
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter --:");
	    int num=sc.nextInt();
	    int rvs=0;
	    
	    while(num!=0){
	        rvs=rvs*10+num%10;
	        num=num/10;
	    }
	    System.out.print("Revese Number-:"+rvs);
	}
}