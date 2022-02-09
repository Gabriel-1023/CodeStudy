package LeetCodeSolutions;

class Solution1583 {
    public static int unhappyFriends(int n, int[][] preferences, int[][] pairs) {
        int[][] order = new int[n][n];
        int[] match = new int[n];
        int num = 0;
        for(int i = 0; i < n;i++)
        {
            for(int j = 0;j < n - 1;j++)
            {
                order[i][preferences[i][j]] = j;
            }
            order[i][i] = -1;
        }
        for(int i = 0;i < (n / 2);i++)
        {
            match[pairs[i][0]] = pairs[i][1];
            match[pairs[i][1]] = pairs[i][0];
        }
        for(int x=0;x<n;x++)
        {
            int y = match[x];
            for(int u=0;u<n;u++)
            {
                int v = match[u];
                if(u!=x && u!=y)
                {
                    if(order[x][u]<order[x][y] && order[u][x]<order[u][v])
                    {
                        num++;
                    }
//                    break;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] preferences = {{1,3,2},{2,3,0},{1,3,0},{0,2,1}};
        int[][] pairs = {{1,3},{0,2}};
        unhappyFriends(n,preferences,pairs);
    }
}
