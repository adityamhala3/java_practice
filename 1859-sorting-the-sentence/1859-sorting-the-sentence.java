class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] ans = new String[str.length];

        for (String w : str) {
            char l = w.charAt(w.length() - 1);
            int p = l - '0';
            ans[p - 1] = w.substring(0, w.length() - 1);
        }

        return String.join(" ", ans);
    }
}