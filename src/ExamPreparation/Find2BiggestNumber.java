package ExamPreparation;

import java.util.Arrays;

public class Find2BiggestNumber{
    public static int[] find2BiggestNumber(int[] input)
    {
        int[] res = new int[2];
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        for(int i:input)
        {
            if (i > max1){
                max2 = max1;
                max1 = i;
            }
            else if (i > max2) max2 = i;
        }
        res[0] = max1;
        res[1] = max2;
        return res;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5,3,212};
        System.out.println(Arrays.toString(find2BiggestNumber(input)));
    }
}
