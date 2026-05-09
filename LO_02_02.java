import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        int sum=(int)Math.pow(a,m)%p;
        
        System.out.println(sum);
    }
}
