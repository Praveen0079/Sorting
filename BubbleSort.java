import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapping = false;
            for (int j = 0; j < arr.length -i -1; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    swapping = true;
                }
            }
            if(!swapping){
                break;
            }
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter Marks of 10 students : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
