class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int a = 0, w = 0, aLen = abbr.length(), wLen = word.length();

        while (a < aLen && w < wLen) {
            char c = abbr.charAt(a);
            
            boolean matched = c == word.charAt(w);
            boolean isDigit = Character.isDigit(c) && c != '0';

            if (matched) {
                a++;
                w++;
            } else if (isDigit) {
                int start = a;
                while (a < aLen && Character.isDigit(abbr.charAt(a))) {
                    a++;
                }
                w += Integer.valueOf(abbr.substring(start, a));
            } else {
                return false;
            }
        }

        return a == aLen && w == wLen;
    }
}