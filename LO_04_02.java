import java.util.*;
public class Main
{
    
    static long factorial(int n){
        long fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long res=factorial(n)/(factorial(k)*(factorial(n-k)));
		System.out.println(res);
		
		
	}
}
