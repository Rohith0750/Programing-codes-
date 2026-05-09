import java.util.*;

public class Main{
    public static void main(String[]a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            int v = sc.nextInt();
            sum=(sum+v)%m;
        }
        System.out.println(sum);
    }
}
