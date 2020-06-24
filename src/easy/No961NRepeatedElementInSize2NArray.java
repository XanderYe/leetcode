package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 叶振东
 * @date 2018-12-24
 */
public class No961NRepeatedElementInSize2NArray {
    public int repeatedNTimes(int[] A) {
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }else{
                map.put(A[i],1);
            }
            if(map.get(A[i])*2==A.length){
                res=A[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        No961NRepeatedElementInSize2NArray solution=new No961NRepeatedElementInSize2NArray();
        int[] A={5,1,5,2,5,3,5,4};
        System.out.println(solution.repeatedNTimes(A));
    }
}
