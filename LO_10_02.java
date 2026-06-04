import java.util.HashMap;
import java.util.Scanner;

public class BookLookup {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, Integer> map = new HashMap<>();

      
        for (int i = 0; i < n; i++) {

            String title = sc.next();
            int id = sc.nextInt();

            map.put(title, id);
        }

        int q = sc.nextInt();

        
        for (int i = 0; i < q; i++) {

            String query = sc.next();

            if (map.containsKey(query))
                System.out.println(map.get(query));
            else
                System.out.println("Book Not Found");
        }

        sc.close();
    }
}

//Scanner helps to take the input 
