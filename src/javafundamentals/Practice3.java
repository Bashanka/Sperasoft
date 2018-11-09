package javafundamentals;

import java.util.Random;
import java.util.Scanner;

public class Practice3 {

    public int[] createArray() {
        System.out.print("Input number of arguments: ");
        Scanner in = new Scanner(System.in);
        int arrLen = in.nextInt();
        System.out.println();
        while (arrLen < 2) {
            System.out.print("Input number of arguments more than 1: ");
            arrLen = in.nextInt();
            System.out.println();
        }
        int[] arr = new int[arrLen];
        Random r = new Random();
        for (int i = 0; i < arrLen; i++) {
            arr[i] = r.nextInt();
        }
        return arr;
    }

    public int[] bubbleSort() {
        int[] arr = createArray();

        for (int i = arr.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int c = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = c;
                }
            }
        }

//        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
//        System.out.println();

        return arr;
    }
    public int[] optimizedBubbleSort() {
        int[] arr = createArray();

        for (int i = arr.length; i > 0; i--) {
            boolean sorted = true;
            for (int j = 0; j < i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int c = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = c;
                    sorted = false;
                }
            }
            if (sorted) return arr;
        }

        return arr;
    }
    public int[] insertionSort() {
        int[] arr = createArray();

        int i = 1;
        while (i < arr.length) {
            int j = i;
            while (j > 0 && arr[j-1] > arr[j]) {
                int c = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = c;
            }
            i++;
        }

        return arr;
    }
    public int[] selectionSort() {
        int[] arr = createArray();

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) min = j;
            }
            if (min != i) {
                int c = arr[i];
                arr[i] = arr[min];
                arr[min] = c;
            }
        }

        return arr;
    }

}
