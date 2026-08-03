class Solution {
    public int heightChecker(int[] x) {
        int c=0;
        int[] ex=x.clone();
     for(int i=0;i<x.length;i++){
        for(int j=1;j<x.length-i;j++){
          if(x[j]<x[j-1]){
            int temp=x[j];
            x[j]=x[j-1];
            x[j-1]=temp;
          }  
        }
        
        }
        for(int i=0;i<x.length;i++){if(ex[i]!=x[i]){
            c++;
        }}
     return c;
    }
}