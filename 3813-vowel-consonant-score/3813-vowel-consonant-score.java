class Solution {
    public int vowelConsonantScore(String s) {
       String y=s.replaceAll("[0-9 ]","");
        int v=0;
        int c=0;
        for(int i=0;i<y.length();i++){
            char ch=y.charAt(i);
            if("aeiou".indexOf(ch)!= -1){
                v++;
               
            }else{
                c++;
            }
        }
        if(c==0){return 0;}return v/c;
    }
}