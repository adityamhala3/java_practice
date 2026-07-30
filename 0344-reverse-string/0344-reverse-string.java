class Solution {
    public void reverseString(char[] s) {
        char[] ch=new char[s.length];
        char temp;
        int t=0;
        int k=0;
        for(int i=s.length-1;i>=0;i--){
            temp=s[i];
            ch[k]=temp;
           k++;
        }
        for(char i:ch){
            s[t++]=i;
        }
    }
}