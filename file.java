import java.util.Arrays;

public class file {
    public static void main(String[] args) {
        int[] arr = {3, 37, 12, 27, 8, 33, 14, 20, 6, 11, 39, 24, 2, 19, 30, 1, 28, 35, 16, 22};
        bubbleSort(arr);
        // selectionSort(arr);
        // display(arr);
        // int[] mArr = mergeSort(arr);
        int n = arr.length;
        System.out.println(arr[n-1]);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void display(int[] arr){
        try {
            Thread.sleep(500); // Adjust the delay as needed
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int i : arr){
            for(int j= 0; j<i ; j++){
                System.out.print("█");
            }
            System.out.println("");
        }    
    }
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int imin = i;
            for(int j = i; j<n; j++){
                if(arr[j]<arr[imin]){
                    imin = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[imin];
            arr[imin] = temp;
            
        display(arr);
        }
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    display(arr);
                }
            }
        }
    }



    // public static void mergeSort(int[] arr){
    //     int n = arr.length;
    //     if(n>1){
    //         int[] a = Arrays.copyOfRange(arr, 0, n/2 );
    //         int[] b = Arrays.copyOfRange(arr, (n/2), n);
    //         a = mergeSort(a);
    //         b = mergeSort(b);
    //         return merge(a,b);
    //     }
    //     return arr;
    // }




    // public static int[] merge(int[] a,int[] b){
    //     int m = a.length;
    //     int n = b.length;
    //     int i = 0; j = 0; k = 0;
    //     int[] c = new int[m+n];


    //     while(i<m && j<n){
    //         if(a[i] <= b[j]){
    //             c[k] = a[i];
    //             i++;
    //         }else{
    //             c[k] = b[j];
    //             j++;
    //         }
    //         k++;
    //     }
    // while(i < m){
    //     c[k] = a[i];
    //     i++;
    //     k++;
    // }
    
    // while(j < n){
    //     c[k] = b[j];
    //     j++;
    //     k++;
    // }

    //     return c;
    // }



    
    // public static quickSort(int[] arr){
        
    // }



}