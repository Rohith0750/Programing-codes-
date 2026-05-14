import java.util.Scanner;

public class TopTenRunners {

    static void mergeSort(int[][] a, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);

            merge(a, left, mid, right);
        }
    }

    static void merge(int[][] a, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[][] L = new int[n1][2];
        int[][] R = new int[n2][2];

        for (int i = 0; i < n1; i++) {
            L[i][0] = a[left + i][0];
            L[i][1] = a[left + i][1];
        }

        for (int j = 0; j < n2; j++) {
            R[j][0] = a[mid + 1 + j][0];
            R[j][1] = a[mid + 1 + j][1];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {

            if (L[i][0] <= R[j][0]) {
                a[k][0] = L[i][0];
                a[k][1] = L[i][1];
                i++;
            } else {
                a[k][0] = R[j][0];
                a[k][1] = R[j][1];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k][0] = L[i][0];
            a[k][1] = L[i][1];
            i++;
            k++;
        }

        while (j < n2) {
            a[k][0] = R[j][0];
            a[k][1] = R[j][1];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] runners = new int[n][2];

        
        for (int i = 0; i < n; i++) {
            runners[i][0] = sc.nextInt();
            runners[i][1] = sc.nextInt();
        }

        mergeSort(runners, 0, n - 1);

        

        for (int i = 0; i < Math.min(10, n); i++) {
            System.out.println(runners[i][0] + " " + runners[i][1]);
        }

        sc.close();
    }
}
