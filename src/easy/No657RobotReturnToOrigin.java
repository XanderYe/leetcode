package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Xander on 2018-10-12.
 */
public class No657RobotReturnToOrigin {
    public static void main(String[] args) {
        System.out.println(new No657RobotReturnToOrigin().judgeCircle("LL"));
    }
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(int i=0;i<moves.length();i++){
            switch(moves.charAt(i)){
                case 'U':y+=1;break;
                case 'D':y-=1;break;
                case 'L':x-=1;break;
                case 'R':x+=1;break;
            }
        }
        return x==0&&y==0;
    }
}
