package com.array.beginner;

public class SerchingInArray {

    public static void main(String[] args) {
        int A[] = {3, 2, 8, 9, 14, 10, 7};
        //System.out.println(array(A, 99));
        // System.out.println(countOfNumber());
        System.out.println(arrayIncreasingOrder());
    }

    public static boolean array(int[] A, int k) {
        int flag = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == k) {
                flag = 1;
            }
        }
        if (flag == 0) {
            return false;
        }
        return true;
    }


    //return count of K in A

    public static int countOfNumber() {
        int A[] = {3, 4, 1, 3, 7, 3, 3, 5};
        int k = 3;
        int count = 0;
        System.out.println(A.length);
        for (int i = 0; i < A.length; i++) {
            if (A[i] == k) {
                count++;
            }
        }
        return count;
    }

    public static boolean arrayIncreasingOrder() {
        int A[] = {3, 4, 5, 6, 7,7, 8, 9};

        for (int i = 1; i < A.length; i++) {
            if (A[i] <= A[i-1]) {
                return false;
            }
        }
        return true;
    }
}
