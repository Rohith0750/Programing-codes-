
import java.util.*;
public class Main
{
    
    static double combination(double n,double r){
        if(r>n && r<0){
            return 0;
        }
        
        
        double res=1;
        for(int i=1;i<=r;i++){
            res=res*(n-r+i)/i;
        }
        return res;
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
     double n=sc.nextInt();
     double d=sc.nextInt();
     double k=sc.nextInt();
     double r=sc.nextInt();
     double neu=combination(d,r)*combination(n-d,k-r);
     double den=combination(n,k);
     
     double pro=neu/den;
     
     System.out.printf("%.6f\n", pro);
     
 }
}
