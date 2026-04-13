public class makeChocolate {
    public static Integer  makeChocolate(int small , int big , int goal){
        int bigbars = goal / 5;
        int remaining = goal - (bigbars * 5);

        if (bigbars > big) {
            bigbars= big;
            if (remaining <= small) {
            }
             return remaining;
            }

            return -1;
        }
        }
    }
}
