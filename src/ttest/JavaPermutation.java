package ttest;

import java.util.Scanner;
public class JavaPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[] arr = new int[num];

        for(int i=0 ; i<num ; i++) {
            arr[i] = sc.nextInt();
        }

        int i = num-1;
        while(i>0 && arr[i-1] >= arr[i]) {
            i--;
        }

        if(i <= 0) {
            System.out.println(-1);
        }else {
            int j = num-1;
            while(j >= i && arr[j] <= arr[i-1]) {
                j--;
            }

            int temp = arr[i-1];
            arr[i-1] = arr[j];
            arr[j] = temp;

            j = num-1;
            while(i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            for(int k=0 ; k<num ; k++) {
                System.out.print(arr[k]+" ");
            }
        }
    }
}

