class Solution {
    public boolean isPalindrome(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;

        int i = 0, j = n-1;

        while (i < j) {
            if (!Character.isLetterOrDigit(ch[i])) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(ch[j])) {
                j--;
                continue;
            }

            if (Character.toLowerCase(ch[i]) != Character.toLowerCase(ch[j])) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}