import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
         
         for(int i=0;i<arr.length;i++){
             int min=i;
             for(int j=i+1;j<arr.length;j++){
                 if(arr[j]<arr[min]){
                     min=j;
                 }
             }
             int temp=arr[i];
             arr[i]=arr[min];
             arr[min]=temp;
         }
         System.out.println(arr[2]);

         for (int i = 0; i < n; i++) {
             System.out.println(arr[i]);
         }
    }
}
