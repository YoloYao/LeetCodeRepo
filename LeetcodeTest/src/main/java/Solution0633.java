class Solution0633 {
    public boolean judgeSquareSum(int c) {
        if (c == 0 || c == 1) {
            return true;
        }
        for (double a = 0; a * a < c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }
}