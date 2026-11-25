import java.util.HashMap;
import java.util.Map;

public class CountPairsWithDiffK {

    public static long countPairs(int[] arr, int k) {
        if (arr == null || arr.length < 2 || k < 0) {
            return 0;
        }

        Map<Long, Long> freq = new HashMap<>();
        long count = 0;
        long targetDiff = k;

        for (int num : arr) {
            long x = num;

            count += freq.getOrDefault(x - targetDiff, 0L);
            if (targetDiff > 0) {
                count += freq.getOrDefault(x + targetDiff, 0L);
            }

            freq.put(x, freq.getOrDefault(x, 0L) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 4, 2};
        int k1 = 2;
        System.out.println("Kết quả 1: " + countPairs(arr1, k1));

        int[] arr2 = {1, 5, 1, 3};
        int k2 = 2;
        System.out.println("Kết quả 2: " + countPairs(arr2, k2));

        int[] arr3 = {2, 2, 2, 2};
        int k3 = 0;
        System.out.println("Kết quả 3: " + countPairs(arr3, k3));
    }
}
