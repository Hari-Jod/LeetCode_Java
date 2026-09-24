class Solution {

    public int reverse(int y) {

        long x = y;

        if (x < 0)
            x = -x;

        long rev = 0L;
        int length = 0;
        long temp = x;

        while (temp > 0) {
            temp /= 10;
            length++;
        }

        long lemp = x;

        while (lemp > 0) {

            rev += (long) ((lemp % 10) * Math.pow(10, length - 1));

            lemp /= 10;
            length--;
        }

        if (y < 0)
            rev = -rev;

        // Check overflow before casting
        if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;

        return (int) rev;
    }
}