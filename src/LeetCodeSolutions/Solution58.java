package LeetCodeSolutions;

class Solution58 {
    public static int lengthOfLastWord(String s) {
        int n = s.length();
        int flag = 0;
        int num = 0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == ' ')
            {
                flag = 1;
            }
            else if(flag == 1)
            {
                if(s.charAt(i) != ' ')
                {
                    num ++;
                }
                else
                {
                    flag = 0;
                    num = 0;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        lengthOfLastWord("Hello World");
    }
}
