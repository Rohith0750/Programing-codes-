import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p=sc.nextInt();
        
        int sum=0;
        
        for(int i=0;i<n;i++){
            double a_i=sc.nextDouble();
            double m_i=sc.nextDouble();
            
             sum +=(int) Math.pow(a_i,m_i)%p;
            
        }
        System.out.println(sum);

        
        
       
    }
}
