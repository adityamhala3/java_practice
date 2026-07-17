class Solution {
    public boolean checkIfPangram(String sentence) {
        // boolean[] bo=new boolean[26];
        // for(char ch:sentence.toCharArray()){
        //     bo[ch-'a']=true;//checking every letter and filling bo arr by true 
        // }
        // for(boolean b:bo){
        //     if(!b){//checking bo arr if there is any element which is false then that string is not a pangram
        //         return false;
        //     }
        // }
        // return true;


        if(sentence.length()<26){
            return false;
        }
        for(char ch='a';ch<='z';ch++){
            if(sentence.indexOf(ch)<0){
                return false;
            }
        }
        return true;
    }
}