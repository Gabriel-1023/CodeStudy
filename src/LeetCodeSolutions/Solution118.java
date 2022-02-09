package LeetCodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> level = new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    level.add(1);
                }
                else
                {
                    level.add(ret.get(i-1).get(j-1)+ret.get(i-1).get(j));
                }
            }
            ret.add(level);
        }

        return ret;
    }

    public static void main(String[] args) {
        generate(5);
    }
}
