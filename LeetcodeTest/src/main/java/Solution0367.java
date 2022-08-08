class Solution0367 {
    public boolean isPerfectSquare(int num) {
        int left = 0, right = num, ans = -1;
        if (num == 0 || num == 1) {
            return true;
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((long) mid * mid <= num) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans * ans == num;
    }
}