class Solution1052 {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int start = 0;
        int end = 0;
        int oriNum = 0;
        int increase = 0;
        int max = 0;
        while (end < customers.length) {
            if (grumpy[end] == 1) {
                increase += customers[end];
            } else {
                oriNum += customers[end];
            }
            end++;
            while (end - start > minutes) {
                if (grumpy[start] == 1) {
                    increase -= customers[start];
                }
                start++;
            }
            max = Math.max(max, increase);
        }
        return oriNum + max;
    }
}