import java.util.Scanner;

public class Merge2D {

    // Merge Sort Function
    public static void mergeSort(int arr[][], int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    // Merge Function
    public static void merge(int arr[][], int left, int mid, int right) {

        int temp[][] = new int[right - left + 1][2];

        int i = left;
        int j = mid + 1;
        int k = 0;

        // Compare finishing times
        while (i <= mid && j <= right) {

            if (arr[i][0] <= arr[j][0]) {

                temp[k][0] = arr[i][0];
                temp[k][1] = arr[i][1];
                i++;

            } else {

                temp[k][0] = arr[j][0];
                temp[k][1] = arr[j][1];
                j++;
            }

            k++;
        }

        // Copy remaining left elements
        while (i <= mid) {

            temp[k][0] = arr[i][0];
            temp[k][1] = arr[i][1];
            i++;
            k++;
        }

        // Copy remaining right elements
        while (j <= right) {

            temp[k][0] = arr[j][0];
            temp[k][1] = arr[j][1];
            j++;
            k++;
        }

        // Copy back to original array
        for (k = 0; k < temp.length; k++) {

            arr[left + k][0] = temp[k][0];
            arr[left + k][1] = temp[k][1];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[][] = new int[N][2];

        // Input finishing time and bib number
        for (int i = 0; i < N; i++) {

            arr[i][0] = sc.nextInt(); // finishing time
            arr[i][1] = sc.nextInt(); // bib number
        }

        // Sort based on finishing time
        mergeSort(arr, 0, N - 1);



        int limit;

        if (N < 10) {
            limit = N;
        } else {
            limit = 10;
        }


        for (int i = 0; i < limit; i++) {

            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
