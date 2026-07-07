class Solution {
    public boolean judgeCircle(String moves) {
    //    int x=0;
    //    int y=0;
    //    for(int i=0;i<moves.length();i++)
    //    {
    //         char c=moves.charAt(i);
    //         switch(c)
    //         {
    //             case 'L':
    //                 x++;
    //                 break;
    //             case 'R':
    //                 x--;
    //                 break;
    //             case 'U':
    //                 y++;
    //                 break;
    //             case 'D':
    //                 y--;
    //                 break;
                
    //         }
      
    //    }
    //     if(x==0 && y==0){
    //     return true;

    //     }
    //     return false;



    int cR=0;
    int cL=0;
    int cU=0;
    int cD=0;
    for(int i=0;i<moves.length();i++){
        char ch=moves.charAt(i);
        if(ch=='L' ){
            cL++;
        
        }
          else if(ch=='R' ){
            cR++;
        
        }
         else if(ch=='U' ){
            cU++;
        
        }
         else if(ch=='D' ){
            cD++;
        
        }
     }
     if(cD==cU && cL==cR){
        return true;
     }
     return false;
    }
}
