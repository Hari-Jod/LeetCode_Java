class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n = encodedText.length();
        int cols = n / rows;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cols; i++) {
            for (int r = 0, c = i; r < rows && c < cols; r++, c++) {
                int index = r * cols + c;
                sb.append(encodedText.charAt(index));
            }
        }
        int lastChar = sb.length() - 1;
        while (lastChar >= 0 && sb.charAt(lastChar) == ' ') {
            lastChar--;
        }
        return sb.substring(0, lastChar + 1);
    }
}