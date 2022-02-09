package ExamPreparation;

public class FindTheLargestProduct {
    public static int find(int[] arr) {
        int min2 = Integer.MAX_VALUE, min1 = Integer.MAX_VALUE, max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max1){
                max2 = max1;
                max1 = i;
            }
            else if (i > max2) max2 = i;
            if (i < min2){
                min1 = min2;
                min2 = i;
            }
            else if (i < min1) min1 = i;
        }
        return Math.max(min1*min2,max1*max2);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1, -2, 1};
        System.out.println(find(arr));
    }
}
