class Solution {
    public int lengthOfLastWord(String s) {
       String[] s1=s.split(" ");
       int a=s1.length;
       return s1[a-1].length(); 
    }
}