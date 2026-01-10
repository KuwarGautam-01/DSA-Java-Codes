package Strings;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(i < j) {
            char l = s.charAt(i);
            char r = s.charAt(j);

            if (!Character.isLetterOrDigit(l)) {
                i++;
            } else if (!Character.isLetterOrDigit(r)) {
                j--;
            } else {
                if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        System.out.println(isPalindrome(s));
    }
}


//problem link: https://leetcode.com/problems/valid-palindrome/description/