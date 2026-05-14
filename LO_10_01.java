import java.util.HashSet;
import java.util.Scanner;

public class HashTableStringLookup {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        HashSet<String> table = new HashSet<>();

        for (int i = 0; i < n; i++) {
            table.add(sc.nextLine());
        }

        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++) {

            String query = sc.nextLine();

            if (table.contains(query))
                System.out.println("Found");
            else
                System.out.println("Not Found");
        }

        sc.close();
    }
}
