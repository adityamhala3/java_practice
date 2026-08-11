class Solution {
    public boolean isPalindrome(String s) {
           String n= s.toLowerCase();
           String k= n.replaceAll("[^0-9a-z]","");
        String temp=k;
        StringBuilder sb=new StringBuilder(k);
            sb.reverse();
            String s1=new String(sb);
            if(temp.equals(s1)){
                return true;
            }

            return false;
    }
}