public class luckySum {
    public static Integer luckySum(int a, int b , int c  nums){
        int sum;
        if(a==13){
            return 0;
        }else{
            if(b==13){
                return b;
            }else{
                if(c==13){
                    return a + b;
                }
                   return  a + b + c;
                }
            }
        }

    }
}
