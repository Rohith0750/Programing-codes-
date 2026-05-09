import java.util.*;

public class LO_01_02{
    public static void main(String[]a){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total=0;
        
        for(int i=0;i<n;i++){
            double prize = sc.nextInt();
              double discount_ip=sc.nextInt();
            total += prize-(prize*discount_ip/100.0);
        }
        
          double disPer=0;
          double fixdis=0;
        if(total>500)disPer=total*0.10;
        if(total>1000)fixdis=150;
        
          double discount=Math.max(disPer,fixdis);
          int total_ammount=(int)(total-discount);
        System.out.println(total_ammount);
    }
}
