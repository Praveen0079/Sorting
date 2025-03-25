import java.util.Scanner;

public class SelectionSort{

    static void display(int[] emp) {
        for(int i=0;i<emp.length;i++) {
            System.out.print(emp[i]+ " ");
        }
        System.out.println();
    }

    static void selectionSort(int[] exm) {
        for(int i=0;i<exm.length-1;i++) {
            int min = i;
            for(int j=i+1;j<exm.length;j++) {
                if(exm[j] < exm[min]) min = j;
            }
            int t = exm[i];
            exm[i] = exm[min];
            exm[min] = t;
        }
    }

    public static void main(String[] strs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int emp[] = new int[n];

        for(int i=0;i<emp.length;i++) emp[i] = sc.nextInt();
        display(emp);
        selectionSort(emp);
        display(emp);
    }
}
