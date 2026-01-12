class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--; // skip spaces
            if (i < 0) break;

            int j = i;
            while (i >= 0 && s.charAt(i) != ' ') i--; // find word

            result.append(s.substring(i + 1, j + 1)).append(" ");
        }
        return result.toString().trim();
    }
}
