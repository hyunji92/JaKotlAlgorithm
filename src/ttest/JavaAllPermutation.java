package ttest;

import java.util.Scanner;

public class JavaAllPermutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        while (nextArr(arr) == true) {
            for (int i = 0; i < num; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static boolean nextArr(int[] arr) {
        int i = arr.length - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) {
            i--;
        }
        if (i <= 0) {
            return false;
        }

        int j = arr.length - 1;
        while (j >= i && arr[j] <= arr[i - 1]) {
            j--;
        }

        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        j = arr.length - 1;
        while(i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return true;
    }
}
