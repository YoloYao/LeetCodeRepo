class Solution0069 {
    public int mySqrt(int x) {
        int left = 0, right = x, ans = -1;
        if (x == 0 || x == 1) {
            return x;
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}