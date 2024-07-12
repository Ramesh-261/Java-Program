import java.io.*;
import java.util.*;

public class cntprint {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        int len = str.length();
        System.out.println(len);
        for (int i = len - 1; i >= 0; i--) {
            System.out.println(str.charAt(i));
        }
    }
}
