package leetcode_string;

class Solution9 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        String s = Integer.toString(x);

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}

public class _9_PalindromeNumber {
    public static void main(String[] args) {
        Solution9 slt = new Solution9();
        int x = -90;
        boolean res = slt.isPalindrome(x);
        System.out.println(res);

    }
}
