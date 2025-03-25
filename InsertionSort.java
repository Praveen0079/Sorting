import java.util.Scanner;

class InsertionSort{

    static void display(int[] emp) {
        for(int i=0;i<emp.length;i++) {
            System.out.print(emp[i]+ " ");
        }
        System.out.println();
    }

    static int[] insertionSort(int[] emp) {
        for(int i=1;i<emp.length;i++) {
            int j = i;
            while(j>=1 && emp[j] < emp[j-1]) {
                int t = emp[j];
                emp[j] = emp[j-1];
                emp[j-1] = t;
                j--;
            }
        }
        return emp;
    }

    public static void main(String[] strs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int emp[] = new int[n];

        for(int i=0;i<emp.length;i++) emp[i] = sc.nextInt();

        display(emp);
        emp = insertionSort(emp);
        display(emp);
    }
}
