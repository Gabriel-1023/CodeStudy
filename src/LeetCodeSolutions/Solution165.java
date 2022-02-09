package LeetCodeSolutions;

class Solution165 {
    public int compareVersion(String version1, String version2) {
        String[] versions1 = version1.split("\\.");
        String[] versions2 = version2.split("\\.");
        int n = Math.max(versions1.length,versions2.length);
        for(int i = 0;i < n;i++)
        {
            int x = 0, y = 0;
            if (i < versions1.length) {
                x = Integer.parseInt(versions1[i]);
            }
            if (i < versions2.length) {
                y = Integer.parseInt(versions2[i]);
            }
            if (x > y) {
                return 1;
            }
            if (x < y) {
                return -1;
            }
        }
        return 0;
    }
}
