package com.array.beginner;

public class SearchingArray2 {
    public static void main(String[] args) {
        System.out.println(singleNumber());

    }

    public static boolean adjecentElement() {
        int A[] = {3, 8, 4, 2, 9, 5};
        int K = -7;
        for (int i = 0; i < A.length; i++) {
            if (A[i] - A[i + 1] == K) {
                return true;
            }

        }
        return false;
    }

    //Element appears 2 times except 1 element. Find & return the Single number
    public static int singleNumber() {
        int A[] = {3, 8, 2, 7, 2, 3, 7};

        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] == A[i]) {
                    count++;
                }
            }
            if (count == 0) {
                return A[i];
            }
        }

        return 1;
    }
}
