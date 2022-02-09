package LeetCodeSolutions;

class Solution743 {
    public static int networkDelayTime(int[][] times, int n, int k) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 100;
            }
        }
        for(int i = 0; i < times.length; i++)
        {
            matrix[times[i][0]-1][times[i][1]-1] = times[i][2];
        }

        int max = dijstra(matrix,k-1);
        return max;
    }

    public static int dijstra(int[][] matrix, int k)
    {
        int[] shortest = new int[matrix.length];
        int[] visited = new int[matrix.length];

        shortest[k] = 0;
        visited[k] = 1;

        for(int i = 0; i < matrix.length;i++)
        {
            int min = Integer.MAX_VALUE;
            int index = -1;

            for(int j = 0; j < matrix.length;j++)
            {
                if(visited[j] == 0 && matrix[k][j] < min)
                {
                    min = matrix[k][j];
                    index = j;
                }
            }

            visited[index] = 1;
            shortest[index] = min;

            for(int m = 0; m < matrix.length;m++) //更新其他最短路径
            {
                if(visited[m] == 0 && matrix[k][index] + matrix[index][m] < matrix[k][m])
                {
                    matrix[k][m] = matrix[k][index] + matrix[index][m];
                }
            }
        }
        int max = 0;
        for(int i = 0; i < matrix.length;i++)
        {
            if(shortest[i] > max)
            {
                max = shortest[i];
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int[][] times = new int[][]{{2,1,1},{2,3,1},{3,4,1}};
        int n = 4;
        int k = 2;
        int max = networkDelayTime(times,n,k);
    }
}
