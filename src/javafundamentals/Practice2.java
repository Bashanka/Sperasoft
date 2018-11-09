package javafundamentals;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice2 {

    public int[] takeData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input array size and a number to search in the array.");
        int[] arr = {in.nextInt(), in.nextInt()};
        while (arr[0] < 2) {
            System.out.println("Input array size again.");
            arr[0] = in.nextInt();
        }
        return arr;
    }

    public int[] createArray(int size) {
        int[] arr = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = r.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }

    public boolean regularSearch() {
        int[] td = takeData();  // size num
        int[] arr = createArray(td[0]);
        long start = System.currentTimeMillis(); // start execution
        for (int i = 0; i < td[0]; i++) {
            if (arr[i] == td[1]) {
                System.out.println("True");
                return true;
            }
        }
        System.out.println("False");
        long end = System.currentTimeMillis(); // end execution
        System.out.println( "execution time: " + (end - start));
        return false;
    }

    public boolean binarySearch() {
        int[] td = takeData();  // size, num
        int[] arr = createArray(td[0]);
        long start = System.currentTimeMillis();
        Arrays.sort(arr);
//        for (int i = 0; i < td[0]; i++) {  // output sorted array
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        // binary search
        int first = 0, last = td[0];
        while (first != last) {
            int middle = (int) Math.floor(first + (last - first) / 2); // middle element between first and last
            if (arr[middle] == td[1]) { // if "middle" element equal desired item
                System.out.println("True");  // write and return true
                long end = System.currentTimeMillis();
                System.out.println( "execution time: " + (end - start));
                return true;
            } else if (arr[middle] < td[1]) { // else if "middle" element bigger than desired item
                first = middle + 1; // do middle item first
            } else if (arr[middle] > td[1]) { // else if "middle" element bigger than desired item
                last = middle - 1; // do middle item first
            }

        }
        System.out.println("False");
        long end = System.currentTimeMillis();
        System.out.println( "execution time: " + (end - start));
        return false;
    }

}
