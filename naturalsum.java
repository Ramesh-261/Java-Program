import java.util.Scanner;
public class naturalsum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int pro=1;
        for(int i=1;i<=num;i++){
            sum+=i;
            pro*=i;
        }
        System.out.println(sum);
        System.out.println(pro);
    }
}
