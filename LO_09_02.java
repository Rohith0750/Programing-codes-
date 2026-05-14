import java.util.Scanner;

public class AccessAudit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int k = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {

            if (arr[i] == x) {

                found = true;

                if (i < k)
                    System.out.println("Valid Access");
                else
                    System.out.println("Late Access");

                break;
            }
        }

        if (!found)
            System.out.println("Access ID Not Found");

        sc.close();
    }
}
