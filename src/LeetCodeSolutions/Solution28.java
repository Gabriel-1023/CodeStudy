package LeetCodeSolutions;

class Solution28 {
    public static int strStr(String haystack, String needle) {
        int length1 = haystack.length();
        int length2 = needle.length();
        int flag;
        if(length2 > length1)
            return -1;
        if(length2 == 0)
            return 0;
        for(int i = 0; i < length1 - length2 + 1;i++)
        {
            flag = 1;
            if(haystack.charAt(i) == needle.charAt(0))
            {
                for(int j = 0; j < length2;j ++)
                {
                    if(haystack.charAt(i+j) != needle.charAt(j))
                    {
                        flag = 0;
                        break;
                    }
                }
                if(flag == 1)
                {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "helllo";
        String needle = "llo";
        strStr(haystack,needle);

    }
}
