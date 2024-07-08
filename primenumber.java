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