package LeetCodeSolutions;

import java.util.Arrays;

public class Solution528
{
    static int[] pre;
    static int[] w = {3,1,2,4};
    public static void main(String[] args) {
        int n = w.length;
        pre = new int[n];
        pre[0] = w[0];
        for(int i=1;i<n;i++)
        {
            pre[i] = pre[i-1]+w[i];
        }
        int total = Arrays.stream(w).sum();
        System.out.println(total);
        System.out.println(pre[n-1]);
    }
}
