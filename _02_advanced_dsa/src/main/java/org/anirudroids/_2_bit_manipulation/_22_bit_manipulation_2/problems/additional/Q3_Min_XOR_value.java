package org.anirudroids._2_bit_manipulation._22_bit_manipulation_2.problems.additional;

import java.util.ArrayList;
import java.util.Collections;

public class Q3_Min_XOR_value {
    /**
     * Problem Description
     * Given an integer array A of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.
     *
     *
     *
     * Problem Constraints
     * 2 <= length of the array <= 100000
     * 0 <= A[i] <= 109
     *
     *
     *
     * Input Format
     * First and only argument of input contains an integer array A.
     *
     *
     *
     * Output Format
     * Return a single integer denoting minimum xor value.
     *
     *
     *
     * Example Input
     * Input 1:
     *
     *  A = [0, 2, 5, 7]
     * Input 2:
     *
     *  A = [0, 4, 7, 9]
     *
     *
     * Example Output
     * Output 1:
     *
     *  2
     * Output 2:
     *
     *  3
     *
     *
     * Example Explanation
     * Explanation 1:
     *
     *  0 xor 2 = 2
     */

    public int findMinXor(ArrayList<Integer> A) {
        int minXor = Integer.MAX_VALUE;

        Collections.sort(A);

        for(int index = 0; index < A.size() - 1; index++) {
            minXor = Math.min(A.get(index) ^ A.get(index + 1), minXor);
        }

        return minXor;
    }
}
