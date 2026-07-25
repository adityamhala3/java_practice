class Solution {
    public int heightChecker(int[] heights) {
      int c=0;
      int[] ex=heights.clone();
      Arrays.sort(ex);
      int i=0;
      int j=0;while(i<heights.length){
       if( heights[i++]!=ex[j++]){c++;}
       } return c; 
    }
}