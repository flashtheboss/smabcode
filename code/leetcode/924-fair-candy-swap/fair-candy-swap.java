class Solution {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int l = aliceSizes.length;
        int n = bobSizes.length;
        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i < l; i++) {
            sum += aliceSizes[i];
        }

        for (int j = 0; j < n; j++) {
            sum1 += bobSizes[j];
        }
        for (int i = 0; i < l; i++) {

            for (int j = 0; j < n; j++) {

                if (checktrue(aliceSizes, i, bobSizes, j,sum,sum1)) {
                    return new int[]{aliceSizes[i],bobSizes[j]};
                }
            }
        }
        return new int[]{};
    }

    static boolean checktrue(int[] ar, int a1, int[] br, int b1,int sum,int sum1) {
        sum = sum - ar[a1] + br[b1];
        sum1 = sum1 - br[b1] + ar[a1];

        return sum == sum1;
    }
}