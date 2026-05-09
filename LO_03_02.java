import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
         int p=sc.nextInt();
          int k=sc.nextInt();
  
        int sum=(a*b)%p;
      if(sum%k==0){
          System.out.println("Divisible");
      }else{
          System.out.println("Not Divisible");
      }
        
       
    }
}
