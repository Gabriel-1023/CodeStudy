package LeetCodeSolutions;

class Solution428 {
    public String licenseKeyFormatting(String s, int k) {
        int length = s.length();
        StringBuffer sb = new StringBuffer();
        int a = length % k;
        if(a != 0)
        {
            sb.append(s.substring(0,a));
        }
        for(int i=a;i<length;i+=k)
        {
            sb.append('-');
            sb.append(s.substring(i,i+k));
        }

        return sb.toString();
    }
}
