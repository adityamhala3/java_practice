public class MAX_MIN_FUN{
    public static void main(String[] args) {
       System.out.println( max(3,4,5));
       System.out.println( MMin(3,4,5));

    }
    static int max(int a,int b,int c){
        if(a>b && a>c){
            return a;
        } else if (b>a && b>c) {
           return b;
        }
        else{
            return c;
        }
    }
        static int MMin(int a,int b,int c){
            if(a<b && a<c){
               return a;
            } else if (b<a && b<c) {
               return b;
            }
            else{
                return c;
            }
        }
    }
