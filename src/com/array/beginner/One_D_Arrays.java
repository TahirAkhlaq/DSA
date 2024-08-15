package com.array.beginner;

import java.lang.reflect.Array;
import java.util.Arrays;

public class One_D_Arrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumArrayOtherLogic()));
    }

    //Write a function that return sum array, In sum Array index should store the sum of all elements from index 0 to index i.
    public static int[] sumArray() {
        int A[] = {1, 2, 3, 4, 5};

        int B[] = new int[A.length];

        for (int i = 0; i < A.length; i++){
            int sum =0;
            for(int j = 0; j<=i; j++){
               sum = sum+A[j];
            }
            B[i]=sum;
        }
        return B;
    }


   /* Prefix Sum Array
   * sum[0] = A[0]
   * sum[1] = sum[0] +A[1]
   * sum[2] = sum[1] +A[2]
   * sum[3] = sum[2] +A[3]
   * sum[4] = sum[3] +A[4]
   * sum[5] = sum[4] +A[5]
   * */
    public static int[] sumArrayOtherLogic() {
        int A[] = {1, 2, 3, 4, 5};

        int sum[] = new int[A.length];
         sum [0] = A[0];

        for (int i = 1; i < A.length; i++) {
            sum[i] = sum[i-1] + A[i];
        }
        return sum;
    }


}
